package com.constructorinjection;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/constructorinjection/applicationContext.xml");
    	Question q = (Question) applicationContext.getBean("q") ;
    	q.display();
    	
    

    }
}
