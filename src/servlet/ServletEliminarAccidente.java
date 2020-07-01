package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryAccidente;
import tablas.Accidente;

public class ServletEliminarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// instancia objeto de tabla
	Accidente acc = new Accidente();

	boolean eliminado = false;
//	String ecmensaje

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();

		acc.setIdaccidente(Integer.parseInt(request.getParameter("id")));

		try {
			eliminado = qa.eliminar(acc);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String mensaje = "";

		if (eliminado)
			mensaje = "el cliente ha sido eliminado exitosamente.";
		else
			mensaje = "el cliente no fue eliminado, se produjo un error";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/resultadoaccidente.jsp");
		request.setAttribute("mensajeeli", mensaje);
		requestDispatcher.forward(request, response);

		
	}
}
