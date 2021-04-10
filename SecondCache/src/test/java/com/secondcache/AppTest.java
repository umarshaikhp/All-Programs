package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {
public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Employee employee =new Employee();
	employee.setName("umarshaikh");
	employee.setSalary("1500");
	
//	Employee employee2  = session.get(Employee.class, 1);
//	System.out.println(employee2.getName()+""+employee2.getSalary());
//	session.close();
}

}
