package com.crispandclear.Student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crispandclear.Student.entity.Student;
import com.crispandclear.Student.repository.StudentRepository;
import com.crispandclear.Student.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo ;
	
	@Override
	public Student addStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Student> getStudentsByTeacherId(Long id) {
				
		return repo.getAllStudentsByTeacherId(id);
	}

}
