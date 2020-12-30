package Modelo;

import java.util.List;

import interfaces.InterCapa;

public class Capacitacion implements InterCapa{
	
	int idcapacitacion, duracion, rutcliente;
	String lugar, fecha, hora;
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int idcapacitacion, String fecha, String hora, String lugar, int duracion, int rutcliente ) {
		super();
		this.idcapacitacion = idcapacitacion;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.lugar = lugar;
		this.rutcliente = rutcliente;
	}


	
	public int getIdcapacitacion() {
		return idcapacitacion;
	}

	public void setIdcapacitacion(int idcapacitacion) {
		this.idcapacitacion = idcapacitacion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getRutcliente() {
		return rutcliente;
	}

	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	

	@Override
	public String toString() {
		return "Capacitacion [idcapacitacion=" + idcapacitacion + ", duracion=" + duracion + ", rutcliente="
				+ rutcliente + ", lugar=" + lugar + ", fecha=" + fecha + ", hora=" + hora + "]";
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
