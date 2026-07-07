package com.hjh.student.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hjh.student.dto.Student;

@Repository
public class StudentRepository {

	private final List<Student> students = new ArrayList<>();

	// http://localhost:8082/students
	public StudentRepository() {
		students.add(new Student(1, "홍길동", 20));
		students.add(new Student(2, "이순신", 23));
		students.add(new Student(3, "강감찬", 22));
	}

	public List<Student> findAll() {
		return students;
	}

}
