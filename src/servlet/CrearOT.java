package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.OTDao;
import tablas.OT;

/**
 * Servlet implementation class CrearOT
 */
public class CrearOT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearOT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CreacionOT.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		int val = 0;
		int pag  = 0;
		int codact = 0; 
		boolean campos_validos = true;
		
		try {
			Integer.parseInt(request.getParameter("txtval"));
		}catch (Exception e){
			campos_validos = false;
		}


		try {
			Integer.parseInt(request.getParameter("txtpag"));
		}catch (Exception e){
			campos_validos = false;
		}

		try {
			Integer.parseInt(request.getParameter("txtcodact"));
		}catch (Exception e){
			campos_validos = false;
		}
		
		if (campos_validos==true){
			val = Integer.parseInt(request.getParameter("txtval"));
			pag = Integer.parseInt(request.getParameter("txtpag"));
			codact = Integer.parseInt(request.getParameter("txtcodact"));
		}
		
		String fecact = request.getParameter("txtfecact");		
		String statact= request.getParameter("txtstatact");
		String rutcli = request.getParameter("txtrutcli");
		String rutprof = request.getParameter("txtrutprof");

		
		OT user = new OT(fecact, val, pag, statact, rutcli, rutprof, codact);
		
		OTDao userdao = new OTDao();
		boolean agregar = false;
		try {
			agregar = userdao.crearOT(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mensaje = "";
		
		if (agregar && (campos_validos=true))
			mensaje = "La OT se ha creado exitosamente";
		else
			mensaje = "Ocurrió un error al crear OT";
		
		request.setAttribute("cumensaje", mensaje);
		request.getRequestDispatcher("CreacionOT.jsp").forward(request, response);
		
	}

}
