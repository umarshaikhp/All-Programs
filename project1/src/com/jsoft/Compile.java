package com.jsoft;

public class Compile {
	void show() {
		System.out.println("hiii");
		
	}}
class Example extends Compile{
	void show() {
		System.out.println("by");
	}
	public static void main(String args[]) {
		
	
Compile obj=new Example();
obj.show();
	}
}
