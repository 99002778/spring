package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.Studentrepository;
import com.student.model.Student;
@Service
public class StudentImpl implements Studentservice {
 @Autowired
 Studentrepository studentrepository;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student s=studentrepository.save(student);
		return s;
	}

	@Override
	public List<Student> getStudentsByAddressCity(String city) {
		 
		// TODO Auto-generated method stub
		
		return studentrepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentsByDept(String Dept) {
		// TODO Auto-generated method stub
		return studentrepository.findByDept(Dept);
	}

	@Override
	public List<Student> findByAge(int age) {
		// TODO Auto-generated method stub
		return studentrepository.findByAge(age);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(id);
		return true;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id);
	}


	 
	 
}
