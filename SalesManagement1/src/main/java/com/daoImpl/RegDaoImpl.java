package com.daoImpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.RegBean;
import com.dao.RegDao;

public class RegDaoImpl implements RegDao {

	public void insertValues(RegBean regBean) {
try {
Configuration conf=new Configuration();
conf.configure("com/controller/hibernate-cfg.xml");
conf.addAnnotatedClass(RegBean.class);
SessionFactory sf=conf.buildSessionFactory();
Session s=sf.openSession();
org.hibernate.Transaction tr=s.beginTransaction();
s.save(regBean);
tr.commit();
}
catch (Exception e) {
	e.printStackTrace();

}


	}

}
