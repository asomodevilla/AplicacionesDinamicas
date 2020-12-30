package Controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Implementacion.CapacitacionDao;
import Modelo.Capacitacion;



@WebServlet("/controladorcapa")
public class controladorcapa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public controladorcapa() {
        super();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		CapacitacionDao capadao = new CapacitacionDao();
		List<Capacitacion> listacapacitacion = new ArrayList<Capacitacion>();
		listacapacitacion = capadao.obtener();
		request.setAttribute("lcapacitacion", listacapacitacion);
		request.getRequestDispatcher
		("listarcapacitaciones.jsp").forward(request, response);
	}

	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		doGet(request, response);
	}

}
