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


public class CapacitacionDao implements InterCapa {

	@Override
	public boolean registrar(Capacitacion capacitacion) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		

		
		String sql = "INSERT INTO capacitacion values ('" 
				+ capacitacion.getIdcapacitacion() + "','" 
				+ capacitacion.getFecha() + "','" 
				+ capacitacion.getHora() + "','"
				+ capacitacion.getLugar() + "')"
				+ capacitacion.getDuracion() + "','" 				
				+ capacitacion.getRutcliente() + "')";
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase CapacitacionDao, "
					+ "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}

	@Override
	public List<Capacitacion> obtener() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM "
				+ "CAPACITACION"; //ORDER BY id
		List<Capacitacion> listaCapacitacion 
			= new ArrayList<Capacitacion>();
		
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + 
				"  " + rs.getString(2) + 
				"  " + rs.getString(3) +
				"  " + rs.getString(4) +
				"  " + rs.getInt(5) +
				"  " + rs.getInt(6)); 
				Capacitacion c = new Capacitacion();
				c.setIdcapacitacion(rs.getInt(1));
				c.setFecha(rs.getString(2));
				c.setHora(rs.getString(3));
				c.setLugar(rs.getString(4));
				c.setDuracion(rs.getInt(5));
				c.setRutcliente(rs.getInt(6));
				listaCapacitacion.add(c);
				
			}
	
			
			rs.close();
			stm.close();
			con.close();
		}
			catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase CapacitacionDao, "
					+ "método obtener");
			e.printStackTrace();
		}		
		
		return 	listaCapacitacion;
	}

	@Override
	public boolean actualizar(Capacitacion capacitacion) {
		
		Connection con = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE capacitacion SET "
				+ "fecha = '" + capacitacion.getFecha() + "', "
				+ "hora = '" + capacitacion.getHora() + "', "
				+ "duracion = '" + capacitacion.getDuracion() + "', "
				+ "lugar = '" + capacitacion.getLugar() + "' "
				+ "WHERE id = '" + capacitacion.getIdcapacitacion() + "'";
		
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase CapacitacionDao, "
					+ "método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Capacitacion capacitacion) {
		Connection con = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM capacitacion "
				+ "WHERE id = '" + capacitacion.getIdcapacitacion() + "'";
		
		try {
			con = conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			con.close();			
		}catch(SQLException e) {
			System.out.println("Error: "
					+ "Clase CapacitacionDao, "
					+ "método eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	public boolean registrar(Usuario usuario) {
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

	@Override
	public List<Usuario> obtenerusuario() {
		// TODO Auto-generated method stub
		return null;
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