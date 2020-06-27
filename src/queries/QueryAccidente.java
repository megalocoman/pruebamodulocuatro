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

public class QueryAccidente {

	public boolean registrar(Accidente accidente) throws ClassNotFoundException {

		boolean registrar = false;

		Statement stm = null;
		Connection conn = null;

		String sql = "INSERT INTO accidente (descripcion, fechaaccidente, clienterutcliente) VALUES ('"
				+ accidente.getDescripcion() + "', '" + accidente.getFechaaccidente() + "', '"
				+ accidente.getClienterutcliente() + "')";

		try {

			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			stm.execute(sql);
			registrar = true;
			conn.close();
			System.out.println("fila ingresada...");

		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo registrar");
			e.printStackTrace();
		}

		return registrar;

	}

	public List<Accidente> obtener() throws ClassNotFoundException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM accidente";

		List<Accidente> listaccidente = new ArrayList<>();

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
			conn.close();

		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo ob tener");
			e.printStackTrace();
		}

		return listaccidente;
	}
	
	public boolean actualizar(Accidente accidente) throws ClassNotFoundException  {
		
		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		boolean actualizar = false;
		String sql= "null";
		
		
			
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
		
		System.out.println(sql);
		try {
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			actualizar = true;
			
		}catch(SQLException e) {
			System.out.println("error de coneccion, metodo actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}
}
