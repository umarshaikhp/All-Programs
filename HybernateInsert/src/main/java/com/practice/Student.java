package com.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jsoft_Table")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name="Id_Client")
private	int id;
@Column(name="Password_Client")
private String password;
@Column(name="Name_Client")
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	

}
