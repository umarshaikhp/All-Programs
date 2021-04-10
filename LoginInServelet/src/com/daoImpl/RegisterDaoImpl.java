package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.RegisterBean;
import com.bean.UserBean;
import com.connectionToDb.ConnectionToDb;
import com.dao.RegisterDao;

public class RegisterDaoImpl  implements RegisterDao{
	@Override
	public void registerAdd(RegisterBean registerBean) {
		//System.out.println(registerBean);

Connection con=null;
PreparedStatement ps=null;
try {
	con=ConnectionToDb.get_connection();
	
	String query="insert into hmk(Fname,Lastname,Username,password,gender,mobileno,Aadharno,Address,DateOfBirth) values(?,?,?,?,?,?,?,?,?)";		
	
   ps=con.prepareStatement(query);
   ps.setString(1, registerBean.getFname());
   ps.setString(2, registerBean.getLname());
   ps.setString(3, registerBean.getUsername());
   ps.setString(4, registerBean.getPassword());
   ps.setString(5, registerBean.getGender());
   ps.setString(6, registerBean.getMno());
   ps.setString(7, registerBean.getAno());
   ps.setString(8, registerBean.getAddress());
   ps.setString(9, registerBean.getDte());
   ps.executeUpdate();
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
		
	}

}
