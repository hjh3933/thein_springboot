package com.hjh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hjh.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
