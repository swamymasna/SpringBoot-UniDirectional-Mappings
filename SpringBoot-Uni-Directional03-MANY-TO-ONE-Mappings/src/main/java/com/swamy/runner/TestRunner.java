package com.swamy.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swamy.entity.School;
import com.swamy.entity.Student;
import com.swamy.repository.SchoolRepository;
import com.swamy.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	public void run(String... args) throws Exception {

		School school = School.builder().schoolName("VBHS").build();
		School school1 = schoolRepository.save(school);
		
		Student student = Student.builder().studentName("swamy").school(school1).build();
		Student savedStudent = studentRepository.save(student);
		System.out.println("Saved Student : " + savedStudent);
	}

}

