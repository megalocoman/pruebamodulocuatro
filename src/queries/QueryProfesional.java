package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import conexiondb.ConnectionDB;
import tablas.Profesional;

public class QueryProfesional {

	public boolean registrar(Profesional profesional) throws ClassNotFoundException, SQLException {

		boolean registrar = false;
		Statement stm = null;
		Connection conn = null;

		String sql = "INSERT INTO profesional (rutprofesional, nombre, telefono, correo) VALUES ('"
				+ profesional.getRutprofesional() + "', '" + profesional.getNombre() + "', " + profesional.getTelefono()
				+ ", '" + profesional.getCorreo() + "')";

		try {

			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			stm.execute(sql);
			registrar = true;

			System.out.println("fila ingresada...");
		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo registrar");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return registrar;
	}

	public List<Profesional> obtener() throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<Profesional> listprof = new ArrayList<>();

		// construccion de query
		String sql = "SELECT * FROM profesional";

		try {

			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				Profesional p = new Profesional();
				p.setRutprofesional(rs.getString(1));
				p.setNombre(rs.getString(2));
				p.setTelefono(rs.getString(3));
				p.setCorreo(rs.getString(4));
				listprof.add(p);

			}
		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return listprof;
	}

	public boolean actualizar(Profesional profesional) throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		boolean actualizar = false;
		String sql = "null";
		
				
		if (!(profesional.getNombre().equals(""))) {
			sql += " , nombre= '" + profesional.getNombre() + "' ";
		}
		System.out.println(profesional.getTelefono());
		if (!(profesional.getTelefono().equals(""))) {
			sql += " , telefono= " + profesional.getTelefono()+"' ";
			
		}
		System.out.println(profesional.getCorreo());
		if (!(profesional.getCorreo().equals(""))) {
			sql += " , correo= '" + profesional.getCorreo() + "' ";
		}

		sql = "UPDATE profesional SET " + sql.replace("null ,", "") + " WHERE rutprofesional = '"
				+ profesional.getRutprofesional() + "'";
		
		System.out.println(sql);
		// connexion base de datos y ejecucion de query
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			actualizar = true;

		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo actualizar");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return actualizar;
	}

	public boolean eliminar(Profesional profesional) throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		boolean eliminar = false;

		// contruccion de query
		String sql = "DELETE FROM profesional WHERE rutprofesional= '" + profesional.getRutprofesional()+"'";

		// connexion base de datos y ejecucion de query
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			stm.execute(sql);
			eliminar = true;

		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo eliminar");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return eliminar;
	}

}
