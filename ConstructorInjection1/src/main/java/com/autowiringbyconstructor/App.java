package com.autowiringbyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiringbyanotation.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiringbyconstructor/web.xml");

		Employee1 emp = context.getBean("emp1", Employee1.class);

		
		 emp.setEid(103); 
		 emp.setEname("Spring Frajmework Guru1");
		  emp.showEployeeDetails();
		 

	}

}
