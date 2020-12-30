package Modelo;

import java.util.List;

import interfaces.InterCapa;

public class Contacto implements InterCapa{

	String nombre, apaterno, amaterno, mail, mensaje, tipousu;

	public Contacto() {
		super();
	}

	public Contacto(String nombre, String apaterno, String amaterno, String mail, String mensaje, String tipousu) {
		super();
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.mail = mail;
		this.mensaje = mensaje;
		this.tipousu = tipousu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTipousu() {
		return tipousu;
	}

	public void setTipousu(String tipousu) {
		this.tipousu = tipousu;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", mail=" + mail
				+ ", mensaje=" + mensaje + ", tipousu=" + tipousu + "]";
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
