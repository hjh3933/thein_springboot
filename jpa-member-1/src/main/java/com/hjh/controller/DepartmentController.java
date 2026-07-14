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
import com.hjh.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private final DepartmentRepository deptRepo;

	public DepartmentController(DepartmentRepository deptRepo) {
		this.deptRepo = deptRepo;
	}

	// 학과 등록
	@PostMapping("/save")
	public String save(@RequestParam("deptName") String deptName) {
		Department dept = new Department();
		dept.setDeptName(deptName);

		deptRepo.save(dept);

		return "학과 등록 완료";
	}

	// 전체 조회
	@GetMapping("/list")
	public List<Department> list() {
		return deptRepo.findAll();
	}

	// 상세 조회
	@GetMapping("/{id}")
	public Department detail(@PathVariable("id") Integer id) {
		return deptRepo.findById(id).orElse(null);
	}

	// 삭제
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Integer id) {
		deptRepo.deleteById(id);
		return "삭제 완료";
	}

}
