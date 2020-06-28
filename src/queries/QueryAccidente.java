package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import conexiondb.ConnectionDB;
import tablas.Accidente;

/**
 *clase queries tabla accidente, con respectivos metodos
 *
 */

public class QueryAccidente {

	//metodo ingresa accidentes
	
	public boolean registrar(Accidente accidente) throws ClassNotFoundException, SQLException {

		boolean registrar = false;
		Statement stm = null;
		Connection conn = null;
		
		// contruccion de query
		String sql = "INSERT INTO accidente (descripcion, fechaaccidente, clienterutcliente) VALUES ('"
				+ accidente.getDescripcion() + "', '" + accidente.getFechaaccidente() + "', '"
				+ accidente.getClienterutcliente() + "')";

		//connexion base de datos y ejecucion de query
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

	//metodo consulta tabla accidentes
	public List<Accidente> obtener() throws ClassNotFoundException, SQLException {

		
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<Accidente> listaccidente = new ArrayList<>();

		// contruccion de query
		String sql = "SELECT * FROM accidente";

		//connexion base de datos y ejecucion de query
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);

			
			while (rs.next()) {
				Accidente a = new Accidente();
				a.setIdaccidente(rs.getInt(1));
				a.setDescripcion(rs.getString(2));
				a.setFechaaccidente(rs.getString(3));
				a.setClienterutcliente(rs.getString(4));
				listaccidente.add(a);
			}
			
		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return listaccidente;
	}
	
	//metodo actualiza tabla accidentes
	public boolean actualizar(Accidente accidente) throws ClassNotFoundException, SQLException  {
		
		
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		boolean actualizar = false;
		String sql= "null";
		
		// contruccion de query
		if (!(Objects.isNull(accidente.getDescripcion()))) {
			sql +=" , descripcion= '" + accidente.getDescripcion() + "' ";
		}
		if (!(Objects.isNull(accidente.getFechaaccidente()))) {
			sql +=" , fechaaccidente = '" + accidente.getFechaaccidente()+"' ";
		}
		if (!(Objects.isNull(accidente.getClienterutcliente()))) {
			sql +=" , clienterutcliente = '" + accidente.getClienterutcliente()+"' ";
		}
			
		sql="UPDATE accidente SET "+sql.replace("null ,", "")+ " WHERE  idaccidente = "+accidente.getIdaccidente();
		
		//connexion base de datos y ejecucion de query
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			actualizar = true;
			
			
		}catch(SQLException e) {
			System.out.println("error de coneccion, metodo actualizar");
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return actualizar;
	}
	
	//metodo elimina fila accidentes
	public boolean eliminar(Accidente accidente) throws ClassNotFoundException, SQLException {
		
		Statement stm = null;
		Connection conn = null;
		boolean eliminar = false;
		
		// contruccion de query
		String sql = "DELETE FROM accidente WHERE idaccidente= "+accidente.getIdaccidente();
		
		//connexion base de datos y ejecucion de query
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			stm.execute(sql);
			eliminar= true;
			
		}catch(SQLException e) {
			System.out.println("error de coneccion, metodo eliminar");
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return eliminar;
	}
}
