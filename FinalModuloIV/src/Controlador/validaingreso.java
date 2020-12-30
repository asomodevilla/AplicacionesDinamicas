package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class validaingreso
 */
@WebServlet("/validaingreso")
public class validaingreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validaingreso() {
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
		
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
	
		if (login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234"))
				{
			HttpSession misesion = request.getSession();
			misesion.setAttribute("nombresesion", "validado");
			request.setAttribute("datonombre", "validado");
			request.getRequestDispatcher("forContacto").forward(request, response); 
				
				}
			
       else {  request.getRequestDispatcher("ingreso.jsp").forward(request, response);   }
		
	}

}
