package com.jsoft;

public class Demo {
	public static void main(String[] args) {
		int min;
		int max;
	int a[]= {12,15,37,-1,48};
	min=a[0];
	max=a[0];
	
	for(int i=1;i<=4;i++) {
		if(a[i]>min) {
			min=a[i];

		}
		if(a[i]<max) {
			max=a[i];
		}
			
		}
	
	System.out.println("min and max number in array"+min+" "+max);


	}

}
