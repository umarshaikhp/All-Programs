package com.practice;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("com/practice/hibernate-cfg.xml");
		con.addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		org.hibernate.Transaction tr=ss.beginTransaction();
		Student student=new Student();
		Query<Student> query=ss.createQuery("delete from Student where id=3");
		int i=query.executeUpdate();
		tr.commit();
		//ss.save(student);
		//System.out.println("delete");


	}

}
