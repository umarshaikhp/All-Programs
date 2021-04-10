package com.constructorinjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> answers;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void display() {
		System.out.println("question id:"+id);
		System.out.println("answer name:"+name);
		System.out.println("Answer....");
	Set<Entry<Answer, User>> set =	answers.entrySet();
Iterator<Entry<Answer, User>> iterator = set.iterator();
while(iterator.hasNext()) {
Entry<Answer, User>	  entry =   iterator.next();
Answer answer = entry.getKey();
User user = entry.getValue();
System.out.println("Answer information");
System.out.println(answer);
System.out.println("posedBy information");
System.out.println(user);


	
}
	}
	}


