package com.autowiringbyconstructor;

import org.springframework.beans.factory.annotation.Autowired;

import com.autowiringbyanotation.Department;

public class Employee1 {
	private int eid;
	private String ename;

	@Autowired
	private Department1 department1;

	
	  public Employee1(Department1 department1) { super(); this.department1 =
	  department1; }
	 
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void showEployeeDetails() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		//department1.setDeptName("Information Technology");
		System.out.println("Department : " + department1.getDeptName());
	}
}