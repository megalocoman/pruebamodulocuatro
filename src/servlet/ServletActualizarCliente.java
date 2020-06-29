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
 * Servlet implementation class ServletActualizarCliente
 */
public class ServletActualizarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Cliente cli = new Cliente();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		cli.setRutcliente(request.getParameter("rut_cli"));
		cli.setNombrecliente(request.getParameter("nombre_cli"));
		cli.setTelefono(request.getParameter("telefono_cli"));
		cli.setDireccion(request.getParameter("direccion_cli"));
		cli.setCorreo(request.getParameter("correo_cli"));
		cli.setContacto(request.getParameter("contacto_cli"));
		
		QueryCliente qc = new QueryCliente();
		
		try {
			qc.actualizar(cli);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/consultacliente.jsp").forward(request, response);
	}

}
