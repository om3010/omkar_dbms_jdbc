package com.gl.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
static Connection con=null;
	
	public static Connection getConnection() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "Raghav@333");
		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		
		
		}
		return con;
	}
}
