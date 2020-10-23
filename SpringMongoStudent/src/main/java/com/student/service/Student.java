package com.student.service;

import java.util.List;

public interface Student {
	Student addStudent(Student student);
	Student deleteStudent(int id);
	Student deleteStudentById(int id);
	List<Student>getStudentsByCity(String city);
	List<Student>getStudentsByDept(String Dept);
	List<Student>findByAge(int age);
	
}
