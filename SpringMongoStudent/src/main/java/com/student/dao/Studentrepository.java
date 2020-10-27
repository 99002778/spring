package com.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.model.Student;

public interface Studentrepository extends MongoRepository<Student,Integer> {
	List<Student>findByAddressCity(String city);
	List<Student>findByDept(String dept);
	List<Student> findByAge(int age);
	Student findById(int id);
	

}
