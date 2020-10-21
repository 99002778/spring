package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	String name;
	int id;
	String dept;
	
	Course course;
	@Autowired
	public Student(Course course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	@Value("${Student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Value("${Student.id}")
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	@Value("${Student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + ", course=" + course + "]";
	}
	 

}
