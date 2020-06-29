package comprobaciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiondb.ConnectionDB;

public class IdNombre {
	/**
	 * retorna el rut dependiendo de nombre y la tabla (profesional o cliente)
	 */
	public String BuscaId(String nombreId, String tabla) throws ClassNotFoundException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		String nombre = null;
		String nomrut = null;

		if (tabla.equals("cliente")) {
			nomrut = "nombrecliente";
		} else if (tabla.equals("profesional")) {
			nomrut = "nombre";
		}

		String sql = "SELECT * FROM " + tabla + " WHERE " + nomrut + " = '" + nombreId + "'";
		System.out.println(sql);

		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				nombre = rs.getString("rutcliente");
			}

		} catch (SQLException e) {
			System.out.println("error de coneccion, ");
			e.printStackTrace();
		}
		System.out.println(nombre);
		return nombre;
	}

	public boolean isRutValido( String rut) {
		
		String[] array = rut.split("-");
		int num = Integer.parseInt(array[0]);
		int ver;
		boolean isvalido = false;
		
		
		if (array[1].equals("K")) {
			ver= 10;	
		}
		else if (array[1].equals("0")) {
			ver= 11;
		}
		else {
			ver=Integer.parseInt(array[1]);
		}
		
		int acum =0;
		int multiplicador=2;
		while (num > 0) {
			int rest_rut = num %10;
			num = num/10;			
			acum = acum +rest_rut*multiplicador;
			++multiplicador;
			if (multiplicador>7) {
				multiplicador= 2;
			}
		}

		int veri_num= 11-(acum - (( acum / 11)*11)) ;
		
		if (veri_num == ver) {
			isvalido= true;
		}
		
		return isvalido;
	}

}
