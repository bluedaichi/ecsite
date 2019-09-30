package com.internousdev.ecsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnector {

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/ecsite";

	private static String userName = "root";
	private static String userPassword = "mysql";

	public Connection getConnection(){
		Connection con = null;

		try {
			Class.forName(driverName);
			con = (Connection)DriverManager.getConnection(url,userName,userPassword);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
