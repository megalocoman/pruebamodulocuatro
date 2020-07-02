package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.OTDao;
import queries.OTDaoconsulta;
import tablas.OT;

/**
 * Servlet implementation class EliminarOT
 */

public class EliminarOT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarOT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		int otnumot = Integer.parseInt(request.getParameter("hdnnumot"));
		System.out.println(otnumot);
		
		OT user = new OT();
		user.setNumot(otnumot);
		
		OTDao userdao = new OTDao();
		boolean elimino = false;
		try {
			elimino = userdao.eliminarOT(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<OTDaoconsulta> listadoeliminar = new ArrayList<OTDaoconsulta>();
		try {
			listadoeliminar = userdao.leerOT();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mensaje = "";
		
		if (elimino)
			mensaje = "La OT ha sido eliminada exitosamente";
		else
			mensaje = "Ocurrió un problema al eliminar OT";
		
		request.setAttribute("cumensaje", mensaje);
		request.setAttribute("listadoot", listadoeliminar);
		request.getRequestDispatcher("ListadoOT.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
