package com.autowiringbyanotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int eid;
    private String ename;
    
     @Autowired
    private Department department;
     
	/*
	 * public Employee(Department department) { super(); this.department =
	 * department; System.out.println("constructor is called"); }
	 */
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
    public void showEployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Information Technology");
        System.out.println("Department : " + department.getDeptName());
    }
}