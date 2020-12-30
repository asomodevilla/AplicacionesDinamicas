package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class forContacto
 */
@WebServlet("/forContacto")
public class forContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		response.getWriter().append("Served at: ").append(request.getContextPath());

		HttpSession sesion = request.getSession();
		if (sesion.getAttribute("nombresesion")!=null)
		request.getRequestDispatcher("contacto.jsp").forward(request, response);
		else
		request.getRequestDispatcher("foringreso").forward(request, response);
	
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String apaterno = request.getParameter("apaterno");
		String amaterno = request.getParameter("amaterno");
		String mail = request.getParameter("mail");
		String mensaje = request.getParameter("mensaje");
		String tipousu = request.getParameter("tipousu");

	System.out.println(nombre);
	System.out.println(apaterno);
	System.out.println(amaterno);
	System.out.println(mail);
	System.out.println(mensaje);
	System.out.println(tipousu);
	
	
	}

}
