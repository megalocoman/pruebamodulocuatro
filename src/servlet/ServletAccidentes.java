package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryAccidente;
import tablas.Accidente;

/**
 * Servlet implementation class ServletAccidentes
 */
public class ServletAccidentes extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//instancia objeto de tabla
	Accidente a = new Accidente();
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setea atributos para ingreso en query
		
		a.setDescripcion(request.getParameter("des_incidente"));
		a.setFechaaccidente(request.getParameter("fecha_inc"));
		a.setClienterutcliente(request.getParameter("cliente"));
		
		// instancia metodos que conectan base de datos y hace queries
		QueryAccidente qa = new QueryAccidente();
		
		try {
			qa.registrar(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// envia a pantalla que indica que se ingresaron datos
		getServletContext().getRequestDispatcher("/ingresoaccidente.jsp").forward(request, response);
	}
}
