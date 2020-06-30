package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexiondb.ConnectionDB;
import tablas.ReporteCliente;
import tablas.ReporteProfesional;

public class QueryInforme {

	public List<ReporteProfesional> informeProfesional() throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<ReporteProfesional> table = new ArrayList<>();

		String sql = "SELECT p.nombre, COUNT(c.nombrecliente), COUNT(a.nombre), SUM(ot.valor),\r\n"
				+ "SUM(ot.valor - ot.pago) \r\n" + "FROM profesional p\r\n"
				+ "JOIN ot ON p.rutprofesional = ot.profesional_rut_profesional\r\n"
				+ "INNER JOIN actividades a ON a.codigoactividad=ot.actividades_codigo_actividad\r\n"
				+ "INNER JOIN cliente c ON c.rutcliente=ot.cliente_rut_cliente\r\n" + "GROUP BY p.nombre";

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
		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return table;
	}

	public List<ReporteCliente> informecliente() throws SQLException, ClassNotFoundException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<ReporteCliente> reportecliente = new ArrayList<>();

		String sql = "SELECT  c.nombre_cliente, c.count_actividad, c.total_valor, c.total_pagado, a.accidente\r\n"
				+ "FROM (\r\n"
				+ "    SELECT c.nombrecliente AS nombre_cliente, COUNT(ot.fecha_actividad) AS count_actividad, SUM(ot.valor) AS total_valor,\r\n"
				+ "SUM(ot.pago) AS total_pagado\r\n" + "FROM cliente c\r\n"
				+ "INNER JOIN ot ON c.rutcliente = ot.cliente_rut_cliente\r\n" + "GROUP BY c.nombrecliente) c\r\n"
				+ "INNER JOIN (\r\n"
				+ "    SELECT c.nombrecliente AS nombre_cliente, COUNT(a.idaccidente) AS accidente\r\n"
				+ "FROM cliente c\r\n" + "INNER JOIN accidente a ON c.rutcliente=a.clienterutcliente\r\n"
				+ "GROUP BY c.nombrecliente) a on c.nombre_cliente=a.nombre_cliente ";

		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				ReporteCliente rc  = new ReporteCliente();
				rc.setNombrecliente(rs.getString(1));
				rc.setNumeroactividades(rs.getInt(2));
				rc.setValortotal(rs.getInt(3));
				rc.setValorpagado(rs.getInt(4));
				rc.setNaccidentes(rs.getInt(5));
				reportecliente.add(rc);
			}
			

		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return reportecliente;

	}
}
