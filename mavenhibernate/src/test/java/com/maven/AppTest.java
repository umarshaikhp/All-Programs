package com.maven;


		
		
	
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest{
	public static void main(String[] args) {
		Configuration cf=new Configuration().configure("com/maven/hibernate.cfg.xml").addAnnotatedClass(Student.class);
	     SessionFactory factory=cf.buildSessionFactory();
		Student student=new Student();
		student.setId(1);
		student.setName("umar");
		student.setCity("mumbai");
		
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		//Transaction tx=session.beginTransaction();
		//session.save(student);
//		tx.commit();
//		session.close();
//		System.out.println("done");
	}}


