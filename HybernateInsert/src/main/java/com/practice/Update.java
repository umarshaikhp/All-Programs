package com.practice;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("com/practice/hibernate-cfg.xml");
		con.addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();

		Session ss=sf.openSession();


		org.hibernate.Transaction tr=ss.beginTransaction();
		Student student=new Student();
		Query<Student> query=ss.createQuery("update Student set name=:n where id=:i");


		query.setParameter("n", "muazzam");
		query.setParameter("i", "1");


		query.executeUpdate();
	      tr.commit();



		//System.out.println(i);


	}

}
