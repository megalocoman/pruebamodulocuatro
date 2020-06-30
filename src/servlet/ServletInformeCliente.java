package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queries.QueryInforme;
import tablas.ReporteCliente;


public class ServletInformeCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    List<ReporteCliente> reporte_cliente = new ArrayList<>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		QueryInforme qi = new QueryInforme();
		
		try {
			reporte_cliente = qi.informecliente();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/informe.jsp");
		request.setAttribute("informe_cli", reporte_cliente);
		requestDispatcher.forward(request, response);
		
	}

	

}
