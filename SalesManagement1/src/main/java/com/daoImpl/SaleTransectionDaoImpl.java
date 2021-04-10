package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.SaleTransectionBean;
import com.dao.SaleTransectionDao;

public class SaleTransectionDaoImpl implements SaleTransectionDao {

	public void inserValues(SaleTransectionBean saleTransectionBean) {
		try {
			Configuration conf=new Configuration();
			conf.configure("com/controller/hibernate-cfg.xml");
			conf.addAnnotatedClass(SaleTransectionBean.class);
			SessionFactory sf=conf.buildSessionFactory();
			Session s=sf.openSession();
			Transaction s1=s.beginTransaction();
			s.save(saleTransectionBean);
			s1.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}

		
	}

}
