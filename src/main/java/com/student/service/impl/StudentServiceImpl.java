package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRespository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRespository studentRespository;

	@Override
	public List<Student> getAllStudents() {
		
	 	return studentRespository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	
		return studentRespository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRespository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRespository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRespository.deleteById(id);
	}
}
