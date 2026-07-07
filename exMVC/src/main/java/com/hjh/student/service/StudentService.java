package com.hjh.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hjh.student.dto.Student;
import com.hjh.student.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepo;

	public StudentService(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}

	public List<Student> findAll() {
		return studentRepo.findAll();
	}

//	ex1
//	public List<Student> findAll() {
//		List<Student> students = new ArrayList<>();
//
//		students.add(new Student(1, "홍길동", 20));
//		students.add(new Student(2, "이순신", 23));
//		students.add(new Student(3, "강감찬", 22));
//
//		return students;
//	}

}
