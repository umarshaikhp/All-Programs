package com.connectionToDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDb {
	public static Connection db() {
		Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/umar","root","root");

	} catch (Exception e) {
e.printStackTrace();
	}	
		return con;
		
		
		
		
		
	}

}
