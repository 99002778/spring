package com.student.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="studenttrail")
@TypeAlias("Studenttrail")
public class Student {
 @Id
	int id;
	int age;
 String name,dept;
 @Autowired
 Address adress;

 public Address getAdress() {
	return adress;
}

 public void setAdress(Address adress) {
	this.adress = adress;
}

 public Student(int id, int age, String name, String dept) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.dept = dept;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Student [id=" + id + ", age=" + age + ", name=" + name + ", dept=" + dept + ", adress=" + adress + "]";
}
 

	 
}
