package Modelo;

public class Cliente extends Usuario {

	int sistemasalud, telefono;
	String  afp, direccion, comuna, edad;
	
	public Cliente() {
		super();
	}

	public int getSistemasalud() {
		return sistemasalud;
	}

	public void setSistemasalud(int sistemasalud) {
		this.sistemasalud = sistemasalud;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Cliente(int sistemasalud, int telefono, String afp, String direccion, String comuna, String edad) {
		super();
		this.sistemasalud = sistemasalud;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [sistemasalud=" + sistemasalud + ", telefono=" + telefono + ", afp=" + afp + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}

	
}

	