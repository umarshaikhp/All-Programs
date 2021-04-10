package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.RegisterBean;
import com.bean.UserBean;
import com.connectionToDb.ConnectionToDb;
import com.dao.LoginDao;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean checkauthentication(RegisterBean registerBean) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean isTrue=false;
		try {
		 con= ConnectionToDb.get_connection();
		 String query="select Username,password from hmk where Username=? and password=?";
        ps= con.prepareStatement(query);
        ps.setString(1,registerBean.getUsername());
        ps.setString(2, registerBean.getPassword());
        rs=ps.executeQuery();
        if(rs.next()) {
        	isTrue=true;
        }
			
		} catch (Exception e) {
        e.printStackTrace();
		}
		finally {
			try {
				ConnectionToDb.closeConnection(con, ps);
				
			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}
		return isTrue;
	}

}
