package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryAccidente;
import tablas.Accidente;

/**
 * Servlet implementation class ServletActualizarAccidente
 */
public class ServletActualizarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Accidente acc = new Accidente();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		acc.setIdaccidente(Integer.parseInt(request.getParameter("id")));
		acc.setDescripcion(request.getParameter("des_incidente"));
		acc.setClienterutcliente(request.getParameter("cliente"));
		acc.setFechaaccidente(request.getParameter("fecha_inc"));
		
		QueryAccidente qa = new QueryAccidente();
		
		try {
			qa.actualizar(acc);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
