package com.crispandclear.Student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crispandclear.Student.entity.Student;

@Service
public interface StudentService {

	public Student addStudent(Student student);
	
	public Student getStudentById(Long id) ;

	public List<Student> getStudentsByTeacherId(Long id);
	
	
}
