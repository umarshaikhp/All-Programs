package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Registration")
public class RegBean {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(unique=true,name="Company_Name")
	private String CompanyName;
	@Column(name="UserName")
	private String UserName;
	@Column(name="mobile_no")
	private String mob;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String pwd;
	@Column(name="remainig_amount")
	private float remainigAmount=0f;
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
	public float getRemainigAmount() {
		return remainigAmount;
	}
	public void setRemainigAmount(float remainigAmount) {
		this.remainigAmount = remainigAmount;
	}
	

}
