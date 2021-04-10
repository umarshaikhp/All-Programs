package com.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructorinjection/web.xml");
Employee employee  = (Employee) context.getBean("emp",Employee.class);
System.out.println(employee);
	}
	

}
