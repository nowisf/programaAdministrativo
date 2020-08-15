package classes.conexionSingleton;

import java.sql.*;

public class ConexionSingleton {

	private static Connection conn = null;
	private String driver;
	private String url;
	private String usuario;
	private String password;
	
	private ConexionSingleton() {
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		//El driver requiere importar al proyecto el ojbc6.jar
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "SIMON";
		password = "123456";
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);	

		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new ConexionSingleton();
			System.out.println("creacion de la conexion singleton");
		}else {
			System.out.println("la conexion singleton ya existe");
		}
		//Statement statement =conn.createStatement();
		return conn;
	}
}