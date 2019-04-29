package com.cbc.model.pojo;

public class BankUser {
private String firstname;
private String lastname;
private int age;
private String gender;
private String contactnumber;
private String city;
private String state;
private String userid;
private String password;
public BankUser() {
	super();
	// TODO Auto-generated constructor stub
}
public BankUser(String firstname, String lastname, int age, String gender, String contactnumber, String city, String state,
		String userid, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.gender = gender;
	this.contactnumber = contactnumber;
	this.city = city;
	this.state = state;
	this.userid = userid;
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
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
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
