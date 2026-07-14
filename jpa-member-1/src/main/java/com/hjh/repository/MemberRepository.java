package com.hjh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hjh.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

	// 이름
	List<MemberEntity> findByName(String name);

	// 나이 조회
	List<MemberEntity> findByAge(Integer age);

	// 해당 나이 이상의 멤버 조회
	List<MemberEntity> findByAgeGreaterThanEqual(Integer age);

	// 키워드를 이름에 포함하는 멤버 조회
	List<MemberEntity> findByNameContaining(String keyword);

}
