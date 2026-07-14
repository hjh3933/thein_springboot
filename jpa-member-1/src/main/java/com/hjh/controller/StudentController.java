package com.hjh.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hjh.entity.Department;
import com.hjh.entity.Student;
import com.hjh.repository.DepartmentRepository;
import com.hjh.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

	private final StudentRepository studentRepo;
	private final DepartmentRepository deptRepo;

	// 학생 등록
	@PostMapping("/save")
	public String save(@RequestParam("name") String name, @RequestParam("deptId") Integer deptId) {

		Department dept = deptRepo.findById(deptId).orElse(null);

		if (dept == null) {
			return "존재하지 않는 학과입니다";
		}

		Student st = new Student();
		st.setName(name);
		st.setDepartment(dept);

		return "학생 등록 완료";
	}

	// 전체 조회
	@GetMapping("/list")
	public List<Student> list() {
		return studentRepo.findAll();
	}

	// 상세 조회
	@GetMapping("/{id}")
	public Student detail(@PathVariable("id") Integer id) {
		return studentRepo.findById(id).orElse(null);
	}

	// 삭제
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		studentRepo.deleteById(id);
		return "삭제 완료";
	}

}
