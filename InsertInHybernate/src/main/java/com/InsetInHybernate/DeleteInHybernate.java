package com.InsetInHybernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteInHybernate {
public static void main(String[] args) {
	

	Configuration conf=new Configuration();
	conf.configure("com/InsetInHybernate/hibernate-cfg.xml");
	conf.addAnnotatedClass(StudentDemo.class);
	SessionFactory s=conf.buildSessionFactory();
	Session s1=s.openSession();
	Transaction tr=s1.beginTransaction();
	StudentDemo studentDemo=new StudentDemo();
Query<StudentDemo>query=s1.createQuery("delete from StudentDemo where EmployeeId=100");
query.executeUpdate();
System.out.println("hiii");
//s1.save(studentDemo);
tr.commit();


	
}

}
