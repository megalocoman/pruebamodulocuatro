package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
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
	
		boolean valido= false;
		
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
		
		String mensajeing = "";

		if (valido)
			mensajeing = "el cliente ha sido ingresado exitosamente.";
		else
			mensajeing = "el cliente no fue ingresado, se produjo un error";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ingresoprofesional.jsp");
		request.setAttribute("mensajeing", mensajeing);
		requestDispatcher.forward(request, response);
		
		
		
	}

}
