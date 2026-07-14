package com.hjh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hjh.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
