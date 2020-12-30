package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Implementacion.UsuarioDao;
import Modelo.Administrativo;
import Modelo.Cliente;
import Modelo.Profesional;

/**
 * Servlet implementation class forValidarAccionUsuario
 */
@WebServlet("/forValidarAccionUsuario")
public class forValidarAccionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forValidarAccionUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession sesion = request.getSession();
		if (sesion.getAttribute("nombresesion")!=null)			
		{
		 int tipo = Integer.parseInt(request.getParameter("hdnidcliente"));
		 String accion = request.getParameter("accion");
		 
	       if (accion.equalsIgnoreCase("C"))  // Para crear usuarios
	      {   
	    	   if (tipo == 1) 
	    	   {//Guarda Administrativo	    	  		    		
	  		int run = Integer.parseInt(request.getParameter("run"));
	  		 System.out.println(run);
	  		String nombre = request.getParameter("nombre");
	  		String apellido = request.getParameter("apellido");
	  		String fechanacimiento = request.getParameter("fechanacimiento");
	  		String correo = request.getParameter("correo");
	  		String area = request.getParameter("area");
	  		
	  		Administrativo adm = new Administrativo();
	  		
	  		adm.setRun(run);
	  		adm.setNombre(nombre);
	  		adm.setApellido(apellido);
	  		adm.setFechanacimiento(fechanacimiento);	  		
	  		adm.setCorreo(correo);
	  		adm.setArea(area);
	  		adm.setTipousuario(tipo);	 
	  		
	  		UsuarioDao usudao = new UsuarioDao();
	  		boolean resultado = usudao.registrar(adm);
	  		request.setAttribute("result", resultado);  		
	    	   }
		 if (tipo == 2)
		 { //Guarda Cliente
			 
			 	int run = Integer.parseInt(request.getParameter("run"));
			 	 System.out.println(run);
		  		String nombre = request.getParameter("nombre");
		  		String apellido = request.getParameter("apellido");
		  		String fechanacimiento = request.getParameter("fechanacimiento");
		  		int telefono = Integer.parseInt(request.getParameter("telefono"));
		  		String afp = request.getParameter("afp");
		  		int sistemasalud = Integer.parseInt(request.getParameter("sistemasalud"));
		  		String direccion = request.getParameter("direccion");
		  		String comuna = request.getParameter("comuna");
		  		String edad = request.getParameter("edad");
		  		

		  		Cliente cli = new Cliente();
		  		
		  		cli.setRun(run);
		  		cli.setNombre(nombre);
		  		cli.setApellido(apellido);
		  		cli.setFechanacimiento(fechanacimiento);
		  		cli.setTelefono(telefono);
		  		cli.setAfp(afp);
		  		cli.setSistemasalud(sistemasalud);
		  		cli.setDireccion(direccion);
		  		cli.setComuna(comuna);
		  		cli.setEdad(edad);
		  		cli.setTipousuario(tipo);		  		
		  		
		  		UsuarioDao usudao = new UsuarioDao();
		  		boolean resultado = usudao.registrar(cli);
		  		request.setAttribute("result", resultado);
			 
		 }
		 if (tipo == 3)
		 {
			//Guarda Profesional			 

			 	int run = Integer.parseInt(request.getParameter("run"));
			 	 System.out.println(run);
		  		String nombre = request.getParameter("nombre");
		  		String apellido = request.getParameter("apellido");
		  		String fechanacimiento = request.getParameter("fechanacimiento");
		  		int telefono = Integer.parseInt(request.getParameter("telefono"));
		  		String titulo = request.getParameter("titulo");
		  		String proyecto = request.getParameter("proyecto");
		  		  		

		  		Profesional pro = new Profesional();
		  		
		  		pro.setRun(run);
		  		pro.setNombre(nombre);
		  		pro.setApellido(apellido);
		  		pro.setFechanacimiento(fechanacimiento);
		  		pro.setTelefono(telefono);
		  		pro.setTitulo(titulo);
		  		pro.setProyecto(proyecto);
		  		pro.setTipousuario(tipo);
		  		
		  		UsuarioDao usudao = new UsuarioDao();
		  		boolean resultado = usudao.registrar(pro);
		  		request.setAttribute("result", resultado);
		 }
		
		request.getRequestDispatcher("msgcrearusuario.jsp").forward(request, response);
	}
	       
		}
	else
	request.getRequestDispatcher("foringreso").forward(request, response);

	}

}
