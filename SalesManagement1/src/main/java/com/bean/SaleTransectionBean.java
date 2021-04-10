package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sale_Transection")
public class SaleTransectionBean {
	@Id
	@Column(name="ST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int st_id;
	@Column(name="Company_Name")
	private String compName;
	@Column(name="Take_From")
	private String takeFrom;
	@Column(name="Place")
	private String place;
	@Column(name="Amount")
	private String amount;
	
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getTakeFrom() {
		return takeFrom;
	}
	public void setTakeFrom(String takeFrom) {
		this.takeFrom = takeFrom;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}


}
