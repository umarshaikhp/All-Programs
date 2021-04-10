package com.jsoft;

import java.util.HashSet;
import java.util.Set;

class Employee{
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {

		return id;
	}
	@Override
	public boolean equals(Object obj) {
	Employee objEmployee =(Employee) obj;
	if (this.name == objEmployee.name) {
		return true ;		
	}
		return false ;
	}
	
	
}
public class SetDuplicateByName {
	public static void main(String[] args) {
		Set<Employee> obj = new HashSet<Employee>();
		obj.add(new Employee(1,"umarshaikh","sakinaka 400072"));
		obj.add(new Employee(2,"umarshaikh","tilak nagar 400073"));
		obj.add(new Employee(3,"umar","kurla 400074"));
		System.out.println(obj);
	}

}
