package project2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Date {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the date");
	
	LocalDate localDate=LocalDate.now();
	System.out.println(localDate);
	String DateOfBirth=obj.nextLine();
	String a[] = DateOfBirth.split("/");
	int date1=Integer.parseInt(a[0]);
System.out.println("hiii");
	int month=Integer.parseInt(a[1]);
	int year=Integer.parseInt(a[2]);
	LocalDate DateOfBirth1=localDate.of(year,month,date1);
	LocalDate currentdate=LocalDate.now();
	
	
Period  age=Period.between(DateOfBirth1, currentdate);
System.out.println(age.getYears());

	}
}
