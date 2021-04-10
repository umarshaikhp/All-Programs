package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringdemoApplication {
public static void main(String[] args) {


ApplicationContext context = new ClassPathXmlApplicationContext("com/autowired/applicationContext.xml");
Employee emp = context.getBean("emp", Employee.class);
emp.setEid(101);
emp.setEname("Spring Framework Guru");
emp.showEployeeDetails();
}

}