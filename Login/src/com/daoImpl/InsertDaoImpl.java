package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.UserBean;
import com.connectionToDb.ConnectionToDb;
import com.dao.InsertDao;

public class InsertDaoImpl  implements InsertDao{

	@Override
	public void insertValues(UserBean userBean) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			String query="insert into student(uname,pwd,email,contact,age) values(?,?,?,?,?) ";

			con=ConnectionToDb.get_connection();
			ps=con.prepareStatement(query);
			ps.setString(1,userBean.getUname());
			ps.setString(2, userBean.getPwd());
			ps.setString(3, userBean.getEmail());
			ps.setString(4, userBean.getContact());
            ps.setInt(5, userBean.getAge());
            ps.executeUpdate();
            ps.close();
			
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

	@Override
	public List<UserBean> getvalues() {
		Connection con=null;
		PreparedStatement ps=null;
		List<UserBean> list=new ArrayList<UserBean>();
		ResultSet rs=null;
		try {
			String query="select * from student";
			con=ConnectionToDb.get_connection();
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			UserBean userBean=null;
            while(rs.next()) {
            	userBean=new UserBean();
           userBean.setId( rs.getInt(1));
           userBean.setUname(rs.getString(2));
           userBean.setPwd(rs.getString(3));
           userBean.setEmail(rs.getString(4));
           userBean.setContact(rs.getString(5));
           userBean.setAge(rs.getInt(6));
           list.add(userBean);
            }
		}catch (Exception e) {
			e.printStackTrace();

		}
		finally {
			try {
				ConnectionToDb.closeConnectionRs(con, ps, rs);
				
			} catch (Exception e2) {
            e2.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void updateValues(UserBean userBean) {
  Connection con=null;
  PreparedStatement ps=null;
  try {
	  String query="update student set uname=?, Email=?, pwd=? , contact=? , age=? where id=?";
	  con=ConnectionToDb.get_connection();
	  ps=con.prepareStatement(query);
	  
	  ps.setString(1,userBean.getUname() );
	  ps.setString(2, userBean.getEmail());
	  ps.setString(3, userBean.getPwd());
	  ps.setString(4, userBean.getContact());
	  ps.setInt(5, userBean.getAge());
	  ps.setInt(6, userBean.getId());
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

	@Override
	public void delete(UserBean userBean) {
Connection con=null;
PreparedStatement ps=null;
try {
	con=ConnectionToDb.get_connection();
	ps=con.prepareStatement("delete from student where id=?");
	ps.setInt(1, userBean.getId());
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
