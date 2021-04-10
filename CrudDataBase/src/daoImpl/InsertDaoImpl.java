package daoImpl;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.InsertDao;
import pojo.UserBean;
import utility.DbConnection;

public class InsertDaoImpl implements InsertDao {

	public void insertValues(UserBean userBean) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			String query="insert into student1(uname,pwd,email,contact,age) values(?,?,?,?,?)";
			conn=DbConnection.get_connection();
			ps=conn.prepareStatement(query);
			ps.setString(1, userBean.getUname());
			ps.setString(2, userBean.getPwd());
			ps.setString(3, userBean.getEmail());
			ps.setString(4, userBean.getContact());
			ps.setInt(5, userBean.getAge());
			int i=ps.executeUpdate();
			System.out.println(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				DbConnection.closeConnection(conn, ps);
				
			} catch (Exception e2) {

			}
		}


		
	}

	@Override
	public void updateValues(UserBean userBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List values(UserBean userBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
