package interfaces;

import java.util.List;

import Modelo.Administrativo;
import Modelo.Capacitacion;
import Modelo.Cliente;
import Modelo.Contacto;
import Modelo.Profesional;
import Modelo.Usuario;

public interface InterCapa {

	public boolean registrar(Capacitacion capacitacion);
	public List<Capacitacion> obtener();
	public List<Usuario> obtenerusuario();
	public boolean actualizar(Capacitacion capacitacion);
	public boolean eliminar(Capacitacion capacitacion);	
	public boolean registrar(Administrativo administrativo);
	public boolean registrar(Cliente cliente);
	public boolean registrar(Profesional profesional);
	public List<Contacto> obtenercontacto();
	public boolean registrar(Contacto contacto);
	
	
	
}
