package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	Student saveStudent(Student student);
	
	void deleteStudent(Long id);
}
