package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryAccidente;
import tablas.Accidente;

public class ServletEliminarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//instancia objeto de tabla
	Accidente acc = new Accidente();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();
		
		acc.setIdaccidente(Integer.parseInt(request.getParameter("id")));
		
		try {
			qa.eliminar(acc);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// envia a pantalla que indica que se ingresaron datos
		response.sendRedirect("/eliminado.jsp");
	}
}
