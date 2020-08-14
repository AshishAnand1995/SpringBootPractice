package com.learn.boot.jpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="Employee")
//@Data
//@ToString
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
   
   @Temporal(TemporalType.DATE)
   @Column(name="doj")
   private Date doj;
   
   @Temporal(TemporalType.TIME)
   @Column(name="toj")
   private Date toj;
   
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="dateTimeOfJoin")
   private Date dateTimeOfJoin;

  // @Lob
   //private byte[] img;//to store image,audio,video,pdfs....
   
   //@Lob
   //private char[] largetext;//for large text data
   @ElementCollection
   @CollectionTable(name="Dept",joinColumns =@JoinColumn(name="empid"))
   @OrderColumn(name="deptindex")
   @Column(name="dept")
   private List<String> dept;

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

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public Date getToj() {
	return toj;
}

public void setToj(Date toj) {
	this.toj = toj;
}

public Date getDateTimeOfJoin() {
	return dateTimeOfJoin;
}

public void setDateTimeOfJoin(Date dateTimeOfJoin) {
	this.dateTimeOfJoin = dateTimeOfJoin;
}

public List<String> getDept() {
	return dept;
}

public void setDept(List<String> dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + ", doj=" + doj
			+ ", toj=" + toj + ", dateTimeOfJoin=" + dateTimeOfJoin + ", dept=" + dept + "]";
}


/*public byte[] getImg() {
	return img;
}

public void setImg(byte[] img) {
	this.img = img;
}

public char[] getLargetext() {
	return largetext;
}

public void setLargetext(char[] largetext) {
	this.largetext = largetext;
}*/


   
   
   
}


