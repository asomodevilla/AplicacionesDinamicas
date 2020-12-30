package Controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Implementacion.CapacitacionDao;
import Modelo.Capacitacion;



/**
 * Servlet implementation class forListarCapacitaciones
 */
@WebServlet("/forListarCapacitaciones")
public class forListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		HttpSession sesion = request.getSession();
		if (sesion.getAttribute("nombresesion")!=null)
		{	CapacitacionDao capadao = new CapacitacionDao();
		List<Capacitacion> listarcapacitaciones = new ArrayList<Capacitacion>();
		listarcapacitaciones = capadao.obtener();
		request.setAttribute("lcapacitaciones", listarcapacitaciones);
		request.getRequestDispatcher("listarcapacitaciones.jsp").forward(request, response);
		}
		else
		request.getRequestDispatcher("foringreso").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
