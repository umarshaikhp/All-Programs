package com.jsoft;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("aaa");
	set.add("aaa");
	set.add(null);
	set.add(null);
	System.out.println(set);
}

}
