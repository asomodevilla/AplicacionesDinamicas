package Modelo;

public class Profesional extends Usuario {

	int telefono;
	String  titulo, proyecto;
	
	public Profesional() {
		super();
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public Profesional(int telefono, String titulo, String proyecto) {
		super();
		this.telefono = telefono;
		this.titulo = titulo;
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Profesional [telefono=" + telefono + ", titulo=" + titulo + ", proyecto=" + proyecto + "]";
	}

	
}