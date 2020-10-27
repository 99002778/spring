package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.Studentservice;

@RestController
@RequestMapping("/student-api")
public class StudentController {
	@Autowired
	Studentservice studentservice;
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	@DeleteMapping("/student/delete-one/{id}")
	public boolean deleteStudent(@PathVariable("id")int id) {
		return studentservice.deleteStudent(id);
	}
	@GetMapping("/student/get-one/{id}")
	public Student getStudentById(@PathVariable("id")int id){
		return studentservice.getStudentById(id);
	}
	@GetMapping("/student/get-by-city/{city}")
	public List<Student> getStudentByAddressCity(@PathVariable("city")String city){
		return studentservice.getStudentsByAddressCity(city);
		}
	@GetMapping("/student/get-by-dept/{dept}")
	public List<Student> getStudentByDept(@PathVariable("dept")String dept){
		return studentservice.getStudentsByDept(dept);
	}

}
