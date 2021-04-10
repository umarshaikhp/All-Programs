package com.dao;

import java.util.List;

import com.bean.Bean;

public interface Dao {
	public void insert(Bean obj);
public List<Bean> fetch();
public void update(Bean obj);
}
