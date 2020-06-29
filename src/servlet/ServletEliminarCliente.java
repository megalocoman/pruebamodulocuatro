package servlet;

import java.io.IOException;
import java.sql.SQLException;

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
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// instancia metodos que conectan base de datos y hace queries
		QueryCliente qc = new QueryCliente();
		
		cli.setRutcliente(request.getParameter("rutcliente"));
		
		try {
			qc.eliminar(cli);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/consultacliente.jsp").forward(request, response);
		
	}

	
}
