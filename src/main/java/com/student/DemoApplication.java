package com.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Student;
import com.student.repository.StudentRespository;

@SpringBootApplication
public class DemoApplication{// implements CommandLineRunner {

//	@Autowired
//	StudentRespository studentRespository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student1 = new Student("Rahul", "Gupta", "test1@gmail.com");
//		Student student2 = new Student("Keshav", "Yadav", "test2@gmail.com");
//		Student student3 = new Student("Hardik", "Singh", "test3@gmail.com");
//
//		studentRespository.saveAll(List.of(student1, student2, student3));
//	}
}