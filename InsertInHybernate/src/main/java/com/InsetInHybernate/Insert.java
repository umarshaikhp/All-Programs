package com.InsetInHybernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("com/InsetInHybernate/hibernate-cfg.xml");
		conf.addAnnotatedClass(StudentDemo.class);
		SessionFactory s=conf.buildSessionFactory();
		Session s1=s.openSession();
		System.out.println("hiii");
		Transaction tr=s1.beginTransaction();
	//	System.out.println();
		StudentDemo studentDemo=new StudentDemo();
		studentDemo.setEmployeeId(101);
		System.out.println("byee");
	s1.save(studentDemo);
	System.out.println("byee");

	tr.commit();
	System.out.println("inserted");
	}

}
