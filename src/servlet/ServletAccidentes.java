package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comprobaciones.IdNombre;
import queries.QueryAccidente;
import tablas.Accidente;

/**
 * Servlet implementation class ServletAccidentes
 */
public class ServletAccidentes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// instancia objeto de tabla
	Accidente a = new Accidente();
	IdNombre nom = new IdNombre();
	String b = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mensaje = "";

		try {
			b = nom.BuscaId((request.getParameter("cliente")), "cliente");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// si el rut null, retorna a pagina de inicio i envia mensaje, funcion mensaje
		// por incluir
		System.out.println("variable " + b);

		if ((Objects.isNull(b))) {

			mensaje = "cliente inexistente";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ingreso.jsp");
			request.setAttribute("mensaje", mensaje);
			requestDispatcher.forward(request, response);

		} else {

			// seta parametros en objeto tabla
			a.setDescripcion(request.getParameter("des_incidente"));
			a.setFechaaccidente(request.getParameter("fecha_inc"));
			a.setClienterutcliente(b);

			// instancia metodos que conectan base de datos y hace queries
			QueryAccidente qa = new QueryAccidente();
			boolean ingresoaccidente = false;

			try {
				ingresoaccidente = qa.registrar(a);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}

			if (ingresoaccidente)
				mensaje = "el cliente ha sido ingresado exitosamente.";
			else
				mensaje = "el cliente no fue ingresado, se produjo un error";

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ingreso.jsp");
			request.setAttribute("mensaje", mensaje);
			requestDispatcher.forward(request, response);

		}
	}
}
