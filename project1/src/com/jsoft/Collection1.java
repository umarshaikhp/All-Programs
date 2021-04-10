package com.jsoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection1 {
	public static void main(String[] args) {
		
	Map<Integer, String> m=new HashMap<Integer, String>();
	m.put(1,"umar");
	m.put(2,"java");
	Set<?> set=m.entrySet();
	Iterator<?> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	/*ArrayList<String> list=new ArrayList<String>(set);
	list.add("python");
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());

	}*/
	}
}
