package com.dao;

import java.util.List;

import com.bean.UserBean;

public interface InsertDao {
	public void insertValues(UserBean userBean);
	public List<UserBean> getvalues();
	public void updateValues(UserBean userBean);
	public void delete(UserBean userBean);

}
