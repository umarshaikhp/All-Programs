package com.InsetInHybernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Table")
public class StudentDemo {
	@Id
	@Column(name="ID")
	

	private Integer EmployeeId;
	@Column(name="Name")

	private String EmployeeName;
	@Column(name="Pasword")

	private String EmployeePassword;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeePassword() {
		return EmployeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		EmployeePassword = employeePassword;
	}
	

}
