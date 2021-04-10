package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class DbConnection {
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/umar";
	private static String USER="root";
	private static String PASSWORD="root";
	
	public static void main(String args[]) {
		System.out.println(get_connection());}
	public static Connection get_connection() {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConnection(Connection con,PreparedStatement ps)throws SQLException{
		if(con!=null) {
			con.close();
			con=null;
		if(ps!=null) {
			ps.close();
			ps=null;
		}
		}
	}
		public static void closeConnectionRs(Connection conn,PreparedStatement ps,ResultSet rs)throws SQLException{
			if(conn!=null) {
				conn.close();
				conn=null;
			if(ps!=null) {
				ps.close();
				ps=null;


			}
			}
		
	
		}
}


