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


public class ContactoDao implements InterCapa {

	@Override
	public boolean registrar(Contacto contacto) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		
		String sql = "INSERT INTO contacto values ('" 
				+ contacto.getNombre() + "','" 
				+ contacto.getApaterno() + "','" 
				+ contacto.getApaterno() + "','"
				+ contacto.getMail() + "','"
				+ contacto.getMensaje() + "','" 				
				+ contacto.getTipousu() + "')";
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase Contacto, "
					+ "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}

	
	
	@Override
	public List<Contacto> obtenercontacto() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM "
				+ "contacto"; //ORDER BY id
		List<Contacto> listaContacto 
			= new ArrayList<Contacto>();
		
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + 
				"  " + rs.getString(2) + 
				"  " + rs.getString(3) +
				"  " + rs.getString(4) +
				"  " + rs.getString(5) +
				"  " + rs.getString(6)); 
				
				
				Contacto c = new Contacto();
				c.setNombre(rs.getString(1));
				c.setApaterno(rs.getString(2));
				c.setAmaterno(rs.getString(3));
				c.setMail(rs.getString(4));
				c.setMensaje(rs.getString(5));
				c.setTipousu(rs.getString(6));
				listaContacto.add(c);
				
			}
	
			
			rs.close();
			stm.close();
			con.close();
		}
			catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase ContactoDao, "
					+ "método obtener");
			e.printStackTrace();
		}		
		
		return 	listaContacto;
	}



	@Override
	public List<Capacitacion> obtener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registrar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> obtenerusuario() {
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

	@Override
	public boolean registrar(Administrativo administrativo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registrar(Profesional profesional) {
		// TODO Auto-generated method stub
		return false;
	}

}