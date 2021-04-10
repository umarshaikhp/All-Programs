package com.constructorinjection;

import java.util.Date;

public class Answer {
	private int id;
	private String name;
	private Date postedBy;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String name, java.util.Date postedBy) {
		super();
		this.id = id;
		this.name = name;
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", postedBy=" + postedBy + "]";
	}


	
	

}
