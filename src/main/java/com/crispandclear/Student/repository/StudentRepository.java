package com.crispandclear.Student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crispandclear.Student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(value = "SELECT * FROM STUDENT WHERE TEACHER_ID = ?1", nativeQuery =true)
	List<Student> getAllStudentsByTeacherId(Long id);

}
