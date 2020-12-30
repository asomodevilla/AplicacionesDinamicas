package Implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Administrativo;
import Modelo.Capacitacion;
import Modelo.Cliente;
import Modelo.Contacto;
import Modelo.Profesional;
import Modelo.Usuario;
import conexion.conexion;
import interfaces.InterCapa;

public class UsuarioDao implements InterCapa {

	
	@Override
	public boolean registrar(Administrativo administrativo) {
		// TODO Auto-generated method stub
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO USUARIOS values ('" 
				+ administrativo.getRun() + "','" 
				+ administrativo.getNombre() + "','" 
				+ administrativo.getApellido() + "','"
				+ administrativo.getFechanacimiento() + "','"
				+ administrativo.getTipousuario() + "')"; 				
			
		
		
		String sql2 = "INSERT INTO ADMINISTRATIVO values ('" 
				+ administrativo.getRun() + "','" 
				+ administrativo.getCorreo() + "','" 
				+ administrativo.getArea() + "','"
				+ administrativo.getRun() +  "')";
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			stm.execute(sql2);
			registrar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase Administrativo, "
					+ "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}

	@Override
	public boolean registrar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO USUARIOS values ('" 
				+ cliente.getRun() + "','" 
				+ cliente.getNombre() + "','" 
				+ cliente.getApellido() + "','"
				+ cliente.getFechanacimiento() + "','"
				+ cliente.getTipousuario() + "')"; 				
		
		
		String sql2 = "INSERT INTO CLIENTE values ('" 
				+ cliente.getRun() + "','" 
				+ cliente.getTelefono() + "','" 
				+ cliente.getAfp() + "','"
				+ cliente.getSistemasalud() + "','"
			    + cliente.getDireccion() + "','"	
			   	+ cliente.getComuna() + "','"
			   	+ cliente.getEdad() + "','"
				+ cliente.getRun() +  "')";
			   
		System.out.println(cliente.getRun() + 
				"  " + cliente.getTelefono() + 
				"  " + cliente.getAfp() +
				"  " + cliente.getSistemasalud() +
				"  " + cliente.getDireccion());
			
			
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			stm.execute(sql2);
			registrar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase Cliente, "
					+ "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}

	@Override
	public boolean registrar(Profesional profesional) {
		// TODO Auto-generated method stub
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO USUARIOS values ('" 
				+ profesional.getRun() + "','" 
				+ profesional.getNombre() + "','" 
				+ profesional.getApellido() + "','"
				+ profesional.getFechanacimiento() + "','"
				+ profesional.getTipousuario() + "')"; 				
			
		
		
		String sql2 = "INSERT INTO PROFESIONAL values ('" 
				+ profesional.getRun() + "','" 
				+ profesional.getTelefono() + "','" 
				+ profesional.getTitulo() + "','"
				+ profesional.getTelefono() + "','"
				+ profesional.getRun() +  "')";
				
			   
			
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			stm.execute(sql2);
			registrar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase Profesional, "
					+ "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}
	
	@Override
	public boolean registrar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Capacitacion> obtener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Usuario> obtenerusuario() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM "
				+ "USUARIOS ORDER BY RUN"; 
		List<Usuario> listarusuario 
			= new ArrayList<Usuario>();
		
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + 
				"  " + rs.getString(2) + 
				"  " + rs.getString(3) +
				"  " + rs.getString(4) +
				"  " + rs.getInt(5));
			 
				Usuario c = new Usuario();
				c.setRun(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellido(rs.getString(3));
				c.setFechanacimiento(rs.getString(4));
				c.setTipousuario(rs.getInt(5));
				listarusuario.add(c);
				
			}
	

			
			rs.close();
			stm.close();
			con.close();
		}
			catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase Obtenerusuario, "
					+ "método obtener");
			e.printStackTrace();
		}		
		
		return 	listarusuario;
	}

	@Override
	public List<Contacto> obtenercontacto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registrar(Contacto contacto) {
		// TODO Auto-generated method stub
		return false;
	}

}
