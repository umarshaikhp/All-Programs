package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.LoginDao;
import pojo.RegisterBean;
import utility.DbConnection;

public class LoginDaoImpl implements LoginDao {


	public boolean checkauthentication(RegisterBean registerBean) {
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean isTrue=false;
		try {
			conn=DbConnection.get_connection();
			String query="select username,password from registerstudent where username=? and password=?";
			ps=conn.prepareStatement(query);


			ps.setString(1, registerBean.getUsername());
			ps.setString(2, registerBean.getPassword());
			rs=ps.executeQuery();
			if(rs.next()) {
				isTrue=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();

	}finally {
			try {
			DbConnection.closeConnectionRs(conn, ps,rs);
					} catch (Exception e2) {
				e2.printStackTrace();

		}
	}


		return isTrue;
	}

}
