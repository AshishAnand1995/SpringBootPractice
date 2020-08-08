package com.learn.boot.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO) 	
   private Integer eid;
   //@Column(name="")
   @Column(name="ename")
   private String ename;
   @Column(name="salary")
   private Double salary;
   @Column(name="deg")
   private String deg;

public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getDeg() {
	return deg;
}
public void setDeg(String deg) {
	this.deg = deg;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
}

   
   
   
}


