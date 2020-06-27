package conexiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	static Connection conn = null;

	// Constructorprivate
	ConnectionDB() throws ClassNotFoundException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "system";
		String password = "nino";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
			System.out.println("databe connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // Fin constructor

	// Métodos

	public static Connection getCon() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			new ConnectionDB();
		} else if (conn.isClosed()) {
			new ConnectionDB();
		}

		return conn;
	} // Fin getConnection
	
}
