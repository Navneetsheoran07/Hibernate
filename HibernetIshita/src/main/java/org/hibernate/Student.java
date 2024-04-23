package org.hibernate;

public class Student {
	private int id;
private String name,course,email,address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public String setName(String name) {
	return this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getEmail() {
	return email;
}
public String setEmail(String email) {
	 return this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}



}
