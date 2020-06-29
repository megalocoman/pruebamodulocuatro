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

import queries.QueryAccidente;
import tablas.Accidente;

/**
 * Servlet implementation class ServletConsultaAccidente
 */

public class ServletConsultaAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// instancia objeto de tabla y lista deobjeto tabla
	Accidente acc = new Accidente();
	List<Accidente> listacc = new ArrayList<Accidente>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();

		try {
			listacc = qa.obtener();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		//envia objeto a pagina jps y para hacer una lista en esta
		String destination = "/resultadoaccidente.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		request.setAttribute("list_acc", listacc);
		requestDispatcher.forward(request, response);
	}
}
