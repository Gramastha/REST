package com.psl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManagerImpl implements ConnectionManager {
Connection connection;
	@Override
	public Connection getDBConnection(String url, String user, String pwd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public void closeConnection() {
		try {
			System.out.println("Connection closed");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
