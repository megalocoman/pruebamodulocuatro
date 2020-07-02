package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.OTDao;
import queries.OTDaoconsulta;


/**
 * Servlet implementation class ListarOT
 */

@WebServlet("/ListarOT")
public class ListarOT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	List<OTDaoconsulta> lot = new ArrayList<>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 OTDao userdao = new OTDao();
		

		try {
			lot = userdao.leerOT();
			System.out.println(lot.getClass());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		String destination = "/ListadoOT.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		request.setAttribute("listadoot", lot);
		requestDispatcher.forward(request, response);
		
//			request.setAttribute("listadoot", lot);
//			request.getRequestDispatcher("ListadoOT.jsp").forward(request, response);
//			 response.sendRedirect("http://www.google.cl");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
