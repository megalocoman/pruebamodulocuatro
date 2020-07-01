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
 * Servlet implementation class ServletActualizarProf
 */
public class ServletActualizarProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Profesional pro = new Profesional();    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean valido= false;
		
		pro.setRutprofesional(request.getParameter("rut_prof"));
		pro.setNombre(request.getParameter("nombre"));
		pro.setTelefono(request.getParameter("telefono"));
		pro.setCorreo(request.getParameter("correo"));
		
		QueryProfesional qp = new QueryProfesional();
		
		
		try {
			valido = qp.actualizar(pro);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		String mensajeact = "";

		if (valido)
			mensajeact = "el cliente ha sido actualizado exitosamente.";
		else
			mensajeact = "el cliente no fue actualizado, se produjo un error";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ingresoprofesional.jsp");
		request.setAttribute("mensajeact", mensajeact);
		requestDispatcher.forward(request, response);
		
	}
}
