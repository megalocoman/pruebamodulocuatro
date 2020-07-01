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

/**
 * Servlet implementation class ServletActualizarAccidente
 */
public class ServletActualizarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//instancia objeto de tabla
	Accidente acc = new Accidente();
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean valido = false;
		
		//setea atributos para ingreso en query
		acc.setIdaccidente(Integer.parseInt(request.getParameter("id")));
		acc.setDescripcion(request.getParameter("des_incidente"));
		acc.setClienterutcliente(request.getParameter("cliente"));
		acc.setFechaaccidente(request.getParameter("fecha_inc"));
		
		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();
		
		try {
			valido = qa.actualizar(acc);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String mensajeact = "";

		if (valido)
			mensajeact = "el cliente ha sido ingresado exitosamente.";
		else
			mensajeact = "el cliente no fue ingresado, se produjo un error";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/resultadoaccidente.jsp");
		request.setAttribute("mensajeact", mensajeact);
		requestDispatcher.forward(request, response);
		
		// envia a pantalla que indica que se ingresaron datos
//		getServletContext().getRequestDispatcher("/consultaaccidente.html").forward(request, response);
		
	}

}
