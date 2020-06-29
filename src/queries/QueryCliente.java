package queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexiondb.ConnectionDB;
import tablas.Cliente;
import tablas.Profesional;

public class QueryCliente {

	public boolean registrar(Cliente cliente) throws ClassNotFoundException, SQLException {

		boolean registrar = false;
		Statement stm = null;
		Connection conn = null;

		String sql = "INSERT INTO cliente (rutcliente, direccion, telefono, correo, contacto, nombrecliente) VALUES ('"
				+ cliente.getRutcliente() + "' , '" + cliente.getDireccion() + "' , '" + cliente.getTelefono() + "' , '"
				+ cliente.getCorreo() + "' , '" + cliente.getContacto() + "' , '" + cliente.getNombrecliente() + "')";

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

	public List<Cliente> obtener() throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		List<Cliente> listprof = new ArrayList<>();

		// construccion de query
		String sql = "SELECT * FROM cliente";

		try {

			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				Cliente cl = new Cliente();
				cl.setRutcliente(rs.getString(1));
				cl.setDireccion(rs.getString(2));
				cl.setTelefono(rs.getString(3));
				cl.setCorreo(rs.getString(4));
				cl.setContacto(rs.getString(5));
				cl.setNombrecliente(rs.getString(6));
				listprof.add(cl);
			}
		} catch (SQLException e) {
			System.out.println("error de coneccion, metodo obtener");
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return listprof;
	}

	public boolean actualizar(Cliente cliente) throws ClassNotFoundException, SQLException {

		Statement stm = null;
		Connection conn = null;
		ResultSet rs = null;
		boolean actualizar = false;
		String sql = "null";

		if (!(cliente.getDireccion().equals(""))) {
			sql += " , direccion = '" + cliente.getDireccion() + "' ";
		}
		if (!(cliente.getTelefono().equals(""))) {
			sql += " , telefono = '" + cliente.getTelefono() + "' ";
		}
		if (!(cliente.getCorreo().equals(""))) {
			sql += " , correo = '" + cliente.getCorreo() + "' ";
		}
		if (!(cliente.getContacto().equals(""))) {
			sql += " , contacto = '" + cliente.getContacto() + "' ";
		}
		if (!(cliente.getNombrecliente().equals(""))) {
			sql += " , nombrecliente = '" + cliente.getNombrecliente() + "' ";
		}

		sql= "UPDATE cliente SET "+sql.replace("null ,", "")+ " WHERE rutcliente = '" +cliente.getRutcliente()+"'" ;
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
	
	public boolean eliminar(Cliente cliente) throws ClassNotFoundException, SQLException {
		
		Statement stm = null;
		Connection conn = null;
		boolean eliminar = false;

		String sql = "DELETE FROM cliente WHERE rutcliente = '" +cliente.getRutcliente()+ "'";
		
		System.out.println(sql);
		try {
			
			conn = ConnectionDB.getCon();
			stm = conn.createStatement();
			stm.execute(sql);
			eliminar = true;
			
		} catch (SQLException e){
			System.out.println("error de coneccion, metodo eliminar");
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return eliminar ;
	}

}
