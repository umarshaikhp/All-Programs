package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManInsert {
	public static void main(String[] args) {
		//Configuration configuration= new Configuration().configure().configure(configFile)
		Configuration con= new Configuration();
		con.configure("com/practice/hibernate-cfg.xml");
		/*configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();*/
		
		con.addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Student student= new Student();
		student.setId(10);
	    student.setPassword("123");

		student.setName("python");

		
		//Session session=sessionFactory.getCurrentSession();
		//Transaction transaction=session.beginTransaction();
		ss.save(student);
	tr.commit();
		

		
	}

}
