package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexiondb.ConnectionDB;
import tablas.ReporteProfesional;

public class QueryInforme {
	
	public List<ReporteProfesional> informeProfesional() throws ClassNotFoundException, SQLException {
		
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<ReporteProfesional> table = new ArrayList<>();

		String sql = "SELECT p.nombre, COUNT(c.nombrecliente), COUNT(a.nombre), SUM(ot.valor),\r\n" + 
				"SUM(ot.valor - ot.pago) \r\n" + 
				"FROM profesional p\r\n" + 
				"JOIN ot ON p.rutprofesional = ot.profesional_rut_profesional\r\n" + 
				"INNER JOIN actividades a ON a.codigoactividad=ot.actividades_codigo_actividad\r\n" + 
				"INNER JOIN cliente c ON c.rutcliente=ot.cliente_rut_cliente\r\n" + 
				"GROUP BY p.nombre";
		
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
				
			while (rs.next()) {
				ReporteProfesional rp = new ReporteProfesional();
				rp.setProfesional(rs.getString(1));
				rp.setNcliente(rs.getInt(2));
				rp.setNactividades(rs.getInt(3));
				rp.setValortotal(rs.getInt(4));
				rp.setTotalpagado(rs.getInt(5));
				table.add(rp);
					
			}
		}catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return table ;
	}
}
