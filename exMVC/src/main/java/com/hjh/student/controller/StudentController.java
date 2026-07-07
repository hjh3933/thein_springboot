package com.hjh.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hjh.student.dto.Student;
import com.hjh.student.service.StudentService;

@RestController
public class StudentController {
	private final StudentService service;

	public StudentController(StudentService studentService) {
		this.service = studentService;
	}

	@GetMapping("/students")
	public List<Student> students() {
		return service.findAll();
	}

}
