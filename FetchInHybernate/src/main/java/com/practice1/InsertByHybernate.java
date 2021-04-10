package com.practice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertByHybernate {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("com/practice1/hibernate-cfg.xml");
		con.addAnnotatedClass(Student1.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		org.hibernate.Transaction tr=ss.beginTransaction();
		Student1 student1=new Student1();
		student1.setId("4");
		student1.setName("faizan");
		student1.setPassword("2345");		
		ss.save(student1);
		tr.commit();
		System.out.println("successs");
		
	}

}
