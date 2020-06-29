package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryProfesional;
import tablas.Profesional;

/**
 * Servlet implementation class ServletObtenerProf
 */

public class ServletConsultarProf extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	Profesional pro = new Profesional();
	List<Profesional> listprof = new ArrayList<Profesional>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QueryProfesional q = new QueryProfesional();

		try {
			listprof = q.obtener();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// envia objeto a pagina jps y para hacer una lista en esta
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/consultaprofesional.jsp");
		request.setAttribute("list_prof", listprof);
		requestDispatcher.forward(request, response);
	}
}
