package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Implementacion.ContactoDao;
import Modelo.Contacto;

/**
 * Servlet implementation class guardarcontacto
 */
@WebServlet("/guardarcontacto")
public class guardarcontacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guardarcontacto() {
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
		doGet(request, response);
		
		
		String nombre = request.getParameter("nombre");
		String apaterno = request.getParameter("apaterno");
		String amaterno = request.getParameter("amaterno");
		String mail = request.getParameter("mail");
		String mensaje = request.getParameter("mensaje");
		String tipousu = request.getParameter("tipousu");

		Contacto con = new Contacto();
		con.setNombre(nombre);
		con.setApaterno(apaterno);
		con.setAmaterno(amaterno);
		con.setMail(mail);
		con.setMensaje(mensaje);
		con.setTipousu(tipousu);
		
		ContactoDao condao = new ContactoDao();
		boolean resultado = condao.registrar(con);

		request.setAttribute("result", resultado);
		request.getRequestDispatcher("forListadoContacto").forward(request, response);
	}

}
