package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Register_UserTable")
public class RegBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name="CompanyName")
	private String CompanyName;
	@Column(name="UserName")
	private String UserName;
	@Column(name="mobile_no")
	private String mob;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String pwd;
	@Column(name="remaining_amount")
	private float remainingAmount=0f;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public float getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(float remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

}
