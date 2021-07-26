package com.training.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class dbutil{
	private static Connection connection = null;

	private dbutil() {
	}

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/amdocsproject";
		String user = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection(url, user, password);
			}
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}
}


