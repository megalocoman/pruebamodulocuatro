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

import queries.QueryInforme;
import tablas.ReporteProfesional;

/**
 * Servlet implementation class ServletInformeProfesional
 */
public class ServletInformeProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<ReporteProfesional> table = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QueryInforme qi = new QueryInforme();

		try {
			table = qi.informeProfesional();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// envia objeto a pagina jps y para hacer una lista en esta

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/informe.jsp");
		request.setAttribute("informe_prof", table);
		requestDispatcher.forward(request, response);
	}

}
