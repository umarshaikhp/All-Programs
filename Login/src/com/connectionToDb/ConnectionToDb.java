package com.connectionToDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionToDb {
	
	public static void main(String args[]) {
	System.out.println(get_connection());
	}
	


	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/umar";
	private static String USER="root";
	private static String PASSWORD="root";


		public static Connection get_connection() {
			Connection con=null;
			try {
				Class.forName(DRIVER);
				con=DriverManager.getConnection(URL,USER,PASSWORD);
				
			} catch (Exception e) {
				e.printStackTrace();

			}
			return con;
	}
	
	
	
	
public static void closeConnection(Connection con,PreparedStatement ps)throws SQLException{
			if(con!=null) {
				con.close();
				con=null;
			}
			if(ps!=null) {
				ps.close();
				ps=null;
			}
}
public static void closeConnectionRs(Connection con,PreparedStatement ps,ResultSet rs)throws SQLException{
	if(con!=null) {
		con.close();
		con=null;
	}
	if(ps!=null) {
		ps.close();
		ps=null;
	}
	if(rs!=null) {
		rs.close();
		rs=null;
	
		
}

}
}


	




