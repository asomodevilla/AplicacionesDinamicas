package Modelo;

import java.util.List;

import interfaces.InterCapa;

public class Usuario implements InterCapa {
	
	int run, tipousuario;
	String nombre, apellido, fechanacimiento;
	
	public Usuario() {
		super();
	}

	
	
	
	
	public int getRun() {
		return run;
	}





	public void setRun(int run) {
		this.run = run;
	}





	public int getTipousuario() {
		return tipousuario;
	}





	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getFechanacimiento() {
		return fechanacimiento;
	}





	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}





	public Usuario(int run, int tipousuario, String nombre, String apellido, String fechanacimiento) {
		super();
		this.run = run;
		this.tipousuario = tipousuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanacimiento = fechanacimiento;
	}





	@Override
	public String toString() {
		return "Usuario [run=" + run + ", tipousuario=" + tipousuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechanacimiento=" + fechanacimiento + "]";
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
