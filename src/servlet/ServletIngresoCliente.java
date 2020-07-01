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
 * Servlet implementation class ServletIngresoCliente
 */
public class ServletIngresoCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cliente cl = new Cliente();
	
	public boolean valido= false;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		cl.setRutcliente(request.getParameter("rut_cliente"));
		cl.setNombrecliente(request.getParameter("nom_cliente"));
		cl.setDireccion(request.getParameter("direccion_cliente"));
		cl.setTelefono(request.getParameter("fono_cliente"));
		cl.setCorreo(request.getParameter("correo_cliente"));
		cl.setContacto(request.getParameter("contacto_cliente"));

		QueryCliente qc = new QueryCliente();

		try {
			valido = qc.registrar(cl);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		// envia a pantalla que indica que se ingresaron datos
		String mensaje = "";
		
		if(valido) 
			mensaje = "el cliente ha sido ingresado exitosamente.";
		else 
			mensaje = "el cliente no fue ingresado, se produjo un error";
			
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ingresocliente.jsp");
//		getServletContext().getRequestDispatcher("/ingresocliente.jsp").forward(request, response);
		request.setAttribute("mensaje", mensaje);
		requestDispatcher.forward(request, response);
		
	}

}
