package com.crispandclear.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crispandclear.Student.entity.Student;
import com.crispandclear.Student.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/add")
	public Student addStudent(@RequestBody Student student) {
		log.info("Adding a student into database having details " + student);
		return studentService.addStudent(student);
	}

	@GetMapping(value = "/getstudentbyid/{id}")
	public Student getStudentById(@PathVariable ("id") Long id) {
		
		log.info("going to retrieve record of student having id as"  + id);
		Student student = studentService.getStudentById(id);
		log.info("Student information is " + student);
		return student ; 
	}
	
	@GetMapping(value = "/getallstuforteacher/{id}")
	public List<Student> listOfStudents(@PathVariable("id") Long id){
		List<Student> listStudents = studentService.getStudentsByTeacherId(id);
		return listStudents;
	}
	
}
