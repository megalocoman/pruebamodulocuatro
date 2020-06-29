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
 * Servlet implementation class ServletIngresoProf
 */


public class ServletIngresoProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Profesional pro = new Profesional();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		pro.setRutprofesional(request.getParameter("rut_prof"));
		pro.setNombre(request.getParameter("nom_prof"));
		pro.setTelefono((request.getParameter("telefono")));
		pro.setCorreo(request.getParameter("correo"));
		
		QueryProfesional q = new QueryProfesional();
		
		try {
			q.registrar(pro);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		
		// envia a pantalla que indica que se ingresaron datos
		getServletContext().getRequestDispatcher("/consultaprofesional.jsp").forward(request, response);
		
		
	}

}
