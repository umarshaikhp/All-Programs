package project2;

import java.util.Scanner;

public class FindSpaces {
	
	public static void main(String[] args) {
		String st;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		st=in.nextLine();
		count(st);
	}
	public static void count(String st) {
		char[] ch=st.toCharArray();
		System.out.println(ch);
		int i=0;
		int s=0;
		int n=0;
		int a=0;
		for(int i1=0;i1<st.length();i1++) {
			//i1++;
			
		
		if(Character.isDigit(ch[i1])) {
		n++;	
	}
	else if(Character.isSpaceChar(ch[i1])) {
		s++;
	}
	else if(Character.isLetter(ch[i1])) {
		i++;
	}
	else {
		a++;	
	}
		}
		System.out.println("numbrt of digit"+n);
		System.out.println("numbrt of spcace"+s);
		System.out.println("numbrt of letter"+i);
		System.out.println("numbrt of other character"+a);

	}
}



