package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryProfesional;
import tablas.Profesional;

/**
 * Servlet implementation class ServletEliminarProf
 */
public class ServletEliminarProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Profesional pro = new Profesional();       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// instancia metodos que conectan base de datos y hace queries
		QueryProfesional qp = new QueryProfesional();
		
		pro.setRutprofesional(request.getParameter("rutprofesional"));
		
		try {
			qp.eliminar(pro);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/consultaprofesional.jsp").forward(request, response);
	}

}
