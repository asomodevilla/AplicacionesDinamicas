package Modelo;

public class Administrativo extends Usuario {

	
	String  correo, area;
	
		
	
	public Administrativo() {
		super();
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	



	@Override
	public String toString() {
		return "Administrativo [correo=" + correo + ", area=" + area + "]";
	}



	public Administrativo(String correo, String area) {
		super();
		this.correo = correo;
		this.area = area;
	}



	



	
	
	
	
}

