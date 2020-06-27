package servlet;

import java.io.IOException;
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

	Accidente acc = new Accidente();

	List<Accidente> listacc = new ArrayList<Accidente>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		QueryAccidente qa = new QueryAccidente();

		try {
			listacc =  qa.obtener();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String destination = "/resultadoaccidente.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		request.setAttribute("list_acc", listacc);
		
		requestDispatcher.forward(request, response);
		
	}
	
	

}
