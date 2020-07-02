package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.OTDao;
import tablas.OT;

/**
 * Servlet implementation class ModificarOT
 */
public class ModificarOT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarOT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int otnumot = 0;
		boolean campos_validos = true;
		
		try {
//			Integer.parseInt(request.getParameter("numot"));
			Integer.parseInt(request.getParameter("hdnnumot"));
		}catch (Exception e){
			campos_validos = false;
		}
		
		if (campos_validos==true){
//			otnumot = Integer.parseInt(request.getParameter("numot"));
			otnumot = Integer.parseInt(request.getParameter("hdnnumot"));
			System.out.println(otnumot);
		}
		
		OTDao userdao = new OTDao(); //Objeto OT
		OT user = new OT(); //OT vacia
		try {
			user = userdao.obtenerOT(otnumot);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //recsato os datos de la OT
		
//		int numot = user.getNumot();
//		String fecha = user.getFecact();
//		int numot = user.getNumot();
//		int numot = user.getNumot();
		
		
		System.out.println("USER= " + user);
		
		request.setAttribute("numot", user.getNumot());
		request.setAttribute("fecact", user.getFecact());
		request.setAttribute("val", user.getVal());
//		request.setAttribute("datosot", "asasdasdasdasd");
		request.setAttribute("statact", user.getStatact());
		request.setAttribute("rutcli", user.getRutcli());
		request.setAttribute("rutprof", user.getRutprof());
		request.setAttribute("codact", user.getCodact());
		
//		request.setAttribute("datosot", user);
		
		request.getRequestDispatcher("ModificarOT.jsp").forward(request, response);
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
		int numot = 0;
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

		try {
			Integer.parseInt(request.getParameter("hdnnumotot"));
		}catch (Exception e){
			campos_validos = false;
		}

		if (campos_validos==true){
			numot = Integer.parseInt(request.getParameter("hdnnumotot"));
			val = Integer.parseInt(request.getParameter("txtval"));
			pag = Integer.parseInt(request.getParameter("txtpag"));
			codact = Integer.parseInt(request.getParameter("txtcodact"));
			
			String fecact = request.getParameter("txtfecact");
			String statact = request.getParameter("txtstatact");
			String rutcli = request.getParameter("txtrutcli");
			String rutprof = request.getParameter("txtrutprof");
			
			OT user = new OT(numot, fecact, val, pag, statact, rutcli, rutprof, codact);
			
			OTDao userdao = new OTDao();
			boolean modificar= false;
			try {
				modificar = userdao.modificarOT(user);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			String mensaje = "";
			
			if ((modificar) && (campos_validos=true))
				mensaje = "La OT se ha modificado exitosamente";
			else
				mensaje = "Error al modificar OT";
			

			request.setAttribute("datosot", user);
			request.setAttribute("cumensaje", mensaje);
			request.getRequestDispatcher("ModificarOT.jsp").forward(request, response);

		}else{
			
			String mensaje = "";
			
			mensaje = "Error al modificar OT";
			

//			request.setAttribute("datosot", user);
			request.setAttribute("cumensaje", mensaje);
			request.getRequestDispatcher("ModificarOT.jsp").forward(request, response);
			
		}
	}

}
