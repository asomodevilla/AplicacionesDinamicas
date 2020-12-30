package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class forElegirUsuario
 */
@WebServlet("/forElegirUsuario")
public class forElegirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forElegirUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession sesion = request.getSession();
		if (sesion.getAttribute("nombresesion")!=null)
		{ int tipo = Integer.parseInt(request.getParameter("tipo"));
		  String accion = request.getParameter("accion");
		       if (tipo == 1 && accion.equalsIgnoreCase("C"))
		    	   request.getRequestDispatcher("crearadministrativo.jsp").forward(request, response);
		       if (tipo == 2 && accion.equalsIgnoreCase("C"))
		   			request.getRequestDispatcher("crearcliente.jsp").forward(request, response);
		       if (tipo == 3 && accion.equalsIgnoreCase("C"))
		   			request.getRequestDispatcher("crearprofesional.jsp").forward(request, response);			
		       if (tipo == 1 && accion.equalsIgnoreCase("E"))
		    	   request.getRequestDispatcher("editardministrativo.jsp").forward(request, response);
		       if (tipo == 2 && accion.equalsIgnoreCase("E"))
		   			request.getRequestDispatcher("editarcliente.jsp").forward(request, response);
		       if (tipo == 3 && accion.equalsIgnoreCase("E"))
		   			request.getRequestDispatcher("editarprofesional.jsp").forward(request, response);	
		}
		else {  request.getRequestDispatcher("ingreso.jsp").forward(request, response);   }
		
		
	}

}
