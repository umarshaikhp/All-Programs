package com.secondcache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.jboss.jandex.TypeTarget.Usage;


@Entity
@Table(name = "Emp100")
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name,salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
}
