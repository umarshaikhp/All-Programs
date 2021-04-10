package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.SaleBean;
import com.dao.SaleDao;

public class SaleDaoImpl implements SaleDao{

	public void insertValues(SaleBean saleBean) {
		try {
			Configuration conf=new Configuration();
			
			  conf.configure("com/controller/hibernate-cfg.xml");
			 conf.addAnnotatedClass(SaleBean.class);
	
			SessionFactory sf=conf.buildSessionFactory();
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			s.save(saleBean);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}
