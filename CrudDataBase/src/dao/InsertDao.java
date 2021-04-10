package dao;

import java.awt.List;

import javax.sound.sampled.LineListener;

import pojo.UserBean;

public interface InsertDao {
	public void insertValues(UserBean userBean);
	public List values(UserBean userBean);
	public void updateValues(UserBean userBean);

}
