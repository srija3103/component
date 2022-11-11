package com.tourist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Tourist {
@Id
public int tid;
private int age;
private String gender;
private String Firstname;
private String Lastname;
private int nodv;
private  String fplace;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public int getNodv() {
	return nodv;
}
public void setNodv(int nodv) {
	this.nodv = nodv;
}
public String getFplace() {
	return fplace;
}
public void setFplace(String fplace) {
	this.fplace = fplace;
}
public Tourist(int tid, int age, String gender, String firstname, String lastname, int nodv, String fplace) {
	super();
	this.tid = tid;
	this.age = age;
	this.gender = gender;
	Firstname = firstname;
	Lastname = lastname;
	this.nodv = nodv;
	this.fplace = fplace;
}

public Tourist() {
	
}
}