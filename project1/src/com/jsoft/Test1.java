package com.jsoft;


	
	
abstract class Person{ 
int a;

	public Person(int b) {
		a=b;
		System.err.println(a);

	}


	}  
	public class Test1 extends Person{
		public Test1(int b) {
			super(b);
			// TODO Auto-generated constructor stub
		}

		
	public static void main(String args[]){  
		Test1 obj=new Test1(20);
		
	   
	 }

	
	}  