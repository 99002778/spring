package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface Studentservice {
	Student addStudent(Student student);
	List<Student> getStudentsByAddressCity(String city);
	List<Student>getStudentsByDept(String Dept);
	List<Student>findByAge(int age);
	boolean deleteStudent(Integer id);
	Student getStudentById(int id);
	
}
