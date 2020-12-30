package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Implementacion.CapacitacionDao;
import Modelo.Capacitacion;



/**
 * Servlet implementation class GuardarCapa
 */
@WebServlet("/GuardarCapa")
public class GuardarCapa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarCapa() {
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
//		doGet(request, response);
	
	int idcapacitacion = Integer.parseInt(request.getParameter("txtidcapacitacion"));
	String fecha = request.getParameter("txtfecha");
	String hora = request.getParameter("txthora");
	int duracion = Integer.parseInt(request.getParameter("txtduracion"));
	String lugar = request.getParameter("txtlugar");


	Capacitacion capa = new Capacitacion();
	capa.setIdcapacitacion(idcapacitacion);
	capa.setFecha(fecha);
	capa.setHora(hora);
	capa.setDuracion(duracion);
	capa.setLugar(lugar);
	
	CapacitacionDao capadao = new CapacitacionDao();
	boolean resultado = capadao.registrar(capa);

	request.setAttribute("result", resultado);
	request.getRequestDispatcher("msgcrearcliente.jsp").forward(request, response); 
}
}
