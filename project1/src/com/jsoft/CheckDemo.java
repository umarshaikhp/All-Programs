package com.jsoft;

import javax.swing.GroupLayout.Alignment;

public class CheckDemo {
	int id;
	String name;

	public CheckDemo(int id) {
		super();
		this.id = id;
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		CheckDemo objCheckDemo = new CheckDemo(10);

	}

}
