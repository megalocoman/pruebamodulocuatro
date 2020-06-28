package comprobaciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiondb.ConnectionDB;


public class IdNombre {
	/**
	 * retorna el rut dependiendo de  nombre y la tabla (profesional o cliente)
	 */
	public String BuscaId(String nombreId, String tabla) throws ClassNotFoundException {
		
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		String nombre = null;
		String nomrut = null;
		
		if (tabla.equals("cliente")) {
			nomrut = "nombrecliente";
		}
		else if(tabla.equals("profesional")) {
			nomrut= "nombre";
		}
				
		String sql = "SELECT * FROM "+ tabla +" WHERE "+nomrut +" = '"+ nombreId+"'";
				
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				nombre= rs.getString("rutcliente");
			}
				
		} catch(SQLException e) {
			System.out.println("error de coneccion, ");
			e.printStackTrace();
		}
		System.out.println(nombre);
		return nombre;
	}
	
//	public boolean isnombreValido(String rut, String tabla) {
//		
//		Statement stm = null;
//		Connection conn = null;
//		ResultSet rs = null;
//		boolean valido = false;
//		
//	
//		
//		return ;
//	}

}
