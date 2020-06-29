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

import queries.QueryCliente;
import tablas.Cliente;

/**
 * Servlet implementation class ServletConsultaCliente
 */
public class ServletConsultaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Cliente> listcli = new ArrayList<Cliente>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QueryCliente qc = new QueryCliente();

		try {
			listcli = qc.obtener();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		// envia objeto a pagina jps y para hacer una lista en esta
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/consultacliente.jsp");
		request.setAttribute("list_cli", listcli);
		requestDispatcher.forward(request, response);

	}
}
