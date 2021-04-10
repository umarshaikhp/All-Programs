package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Bean;
import com.connectionToDb.ConnectionToDb;
import com.dao.Dao;

public class DaoImpl implements Dao {

	@Override
	public void insert(Bean obj) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn=ConnectionToDb.db();
			ps=conn.prepareStatement("insert into jsoft values(?,?)");
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getPassword());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Bean> fetch() {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Bean> list=new ArrayList<Bean>();
		try {
			con=ConnectionToDb.db();
			ps=con.prepareStatement("select * from jsoft");
			rs=ps.executeQuery();

			while(rs.next()) {
				Bean bean=new Bean();
               bean.setName(rs.getString("name"));
               bean.setPassword(rs.getString("password"));
               list.add(bean);
			}
			
		} catch (Exception e) {
e.printStackTrace();
		}

		return list;
	}

	@Override
	public void delete(Bean obj) {
Connection con=null;
PreparedStatement ps=null;
try {
	con=ConnectionToDb.db();
	ps=con.prepareStatement("delete from jsoft where password=?");
	ps.setString(1,obj.getPassword() );
	ps.executeUpdate();
	ps.close();
	
} catch (Exception e) {
e.printStackTrace();
}
		
	}

}
