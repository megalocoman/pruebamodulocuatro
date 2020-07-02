package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexiondb.ConnectionDB;
import tablas.OT;

public class OTDao {
	
	
	public boolean crearOT(OT user) throws ClassNotFoundException {

		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO OT VALUES (null,'" + user.getFecact() + "','"
				+ user.getVal() + "','" + user.getPag() + "','"
				+ user.getStatact() + "','" + user.getRutcli() + "','"
				+ user.getRutprof() + "','" + user.getCodact() + "')";

		try {
			con = ConnectionDB.getCon();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase OTDao, método crearOT");
			e.printStackTrace();
		}

		return registrar;

	}

	
	public List<OTDaoconsulta> leerOT() throws ClassNotFoundException {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT ot.numeroot, ot.fecha_actividad, ot.valor, ot.pago, ot.statusactividad, c.nombrecliente, p.nombre, a.descripcion\r\n" + 
				"FROM ot \r\n" + 
				"JOIN cliente c ON ot.cliente_rut_cliente=c.rutcliente\r\n" + 
				"JOIN profesional p ON ot.profesional_rut_profesional=p.rutprofesional\r\n" + 
				"JOIN actividades a ON ot.actividades_codigo_actividad = a.codigoactividad";

		List<OTDaoconsulta> listaOT = new ArrayList<OTDaoconsulta>();

		try {
			con = ConnectionDB.getCon();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				OTDaoconsulta c = new OTDaoconsulta();
				c.setNumeroot((rs.getInt(1)));
				c.setFecha_actividad((rs.getString(2)));
				c.setValor((rs.getInt(3)));
				c.setPago((rs.getInt(4)));
				c.setStatusactividad((rs.getString(5)));
				c.setNombrecliente((rs.getString(6)));
				c.setNombreprof((rs.getString(7)));
				c.setDescripcion((rs.getString(8)));
				listaOT.add(c);
			}
			stm.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase OTDao, método leerOT ");
			e.printStackTrace();
		}

		return listaOT;
	}

	
	public boolean modificarOT(OT user) throws ClassNotFoundException {
	
		String feact = user.getFecact();

		
		String feact2 = feact;
		String feact3 = feact2.substring(0, 9);

		
		Connection con = null;
		Statement stm = null;

		boolean modificar = false;

		String sql = "UPDATE OT SET FECHA_ACTIVIDAD = TO_DATE('" + feact3 + "', 'YYYY/MM/DD')"
				+ ", VALOR = '" + user.getVal() + "', PAGO = '"
				+ user.getPag() + "', STATUSACTIVIDAD = '" + user.getStatact()
				+ "', CLIENTE_RUT_CLIENTE = '" + user.getRutcli()
				+ "', PROFESIONAL_RUT_PROFESIONAL = '" + user.getRutprof()
				+ "', ACTIVIDADES_CODIGO_ACTIVIDAD = '" + user.getCodact()
				+ "' WHERE NUMEROOT = '" + user.getNumot() + "'";

		try {
			System.out.println(sql);
			con = ConnectionDB.getCon();
			stm = con.createStatement();
			stm.execute(sql);
			modificar = true;
			stm.close();
			// con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase OTDao, método modificar");
			e.printStackTrace();
		}

		return modificar;

	}

	public boolean eliminarOT(OT user) throws ClassNotFoundException {

		Connection con = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM OT WHERE NUMEROOT = " + user.getNumot();

		try {
			con = ConnectionDB.getCon();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			// con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase OTDao, método eliminarOT");
			e.printStackTrace();
		}

		return eliminar;
	}

	public OT obtenerOT(int numot) throws ClassNotFoundException {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM OT WHERE NUMEROOT = " + numot;

		OT u = new OT();
		try {
			con = ConnectionDB.getCon();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setNumot(rs.getInt(1));
				u.setFecact(rs.getString(2));
				u.setVal(rs.getInt(3));
				u.setPag(rs.getInt(4));
				u.setStatact(rs.getString(5));
				u.setRutcli(rs.getString(6));
				u.setRutprof(rs.getString(7));
				u.setCodact(rs.getInt(8));
			}
			stm.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase OTDao, método obtenerOT ");
			e.printStackTrace();
		}

		return u;
	}
}
