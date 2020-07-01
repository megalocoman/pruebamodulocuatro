package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryCliente;
import tablas.Cliente;

/**
 * Servlet implementation class ServletEliminarCliente
 */
public class ServletEliminarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cliente cli = new Cliente();
	boolean eliminarvalido = false;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// instancia metodos que conectan base de datos y hace queries
		QueryCliente qc = new QueryCliente();

		cli.setRutcliente(request.getParameter("rutcliente"));

		try {
			eliminarvalido = qc.eliminar(cli);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String mensajeelicliente = "";

		if (eliminarvalido)
			mensajeelicliente = "el cliente ha sido eliminado exitosamente.";
		else
			mensajeelicliente = "el cliente no fue eliminado, se produjo un error";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/consultacliente.jsp");
		request.setAttribute("mensaje", mensajeelicliente);
		requestDispatcher.forward(request, response);



	}

}
