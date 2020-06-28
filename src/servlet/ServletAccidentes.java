package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

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

		try {
			b = nom.BuscaId((request.getParameter("cliente")), "CLIENTE");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//si el rut null, retorna a pagina de inicio i envia mensaje, funcion mensaje por incluir
		
		if (Objects.isNull(b)) {
			getServletContext().getRequestDispatcher("/accidente.html").forward(request, response);
		}
		
		// seta parametros en objeto tabla
		a.setDescripcion(request.getParameter("des_incidente"));
		a.setFechaaccidente(request.getParameter("fecha_inc"));
		a.setClienterutcliente(b);

		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();

		try {
			qa.registrar(a);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		// envia a pantalla que indica que se ingresaron datos
		getServletContext().getRequestDispatcher("/ingresoaccidente.jsp").forward(request, response);
	}
}
