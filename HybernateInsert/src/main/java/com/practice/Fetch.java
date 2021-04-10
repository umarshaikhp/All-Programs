package com.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("com/practice/hibernate-cfg.xml");
		con.addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		org.hibernate.Transaction tr=ss.beginTransaction();
		Student student=new Student();
		Query<Student> query=ss.createQuery("from Student");
		List<Student> list=query.getResultList();
		Iterator<Student>itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s.getId()+" "+s.getPassword()+" "+s.getName());
			
		}

		
	}

}
