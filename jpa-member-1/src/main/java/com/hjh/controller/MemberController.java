package com.hjh.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hjh.entity.MemberEntity;
import com.hjh.repository.MemberRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "회원관리", description = "회원 CRUD API")
@RestController
@RequestMapping("/member")
public class MemberController {

	private final MemberRepository memberRepo;

	public MemberController(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}

	// 등록
	@Operation(summary = "회원 저장")
	@PostMapping("/save")
	public String save() {
		MemberEntity member = new MemberEntity();
		member.setName("홍길동");
		member.setAge(20);

		memberRepo.save(member);
		return "저장 완료";
	}

	// 회원 전체 조회
	@Operation(summary = "회원 목록")
	@GetMapping("/list")
	public List<MemberEntity> list() {
		return memberRepo.findAll();
	}

	// 회원 조회
	@GetMapping("/{id}")
	public MemberEntity detail(@PathVariable("id") Integer id) {
		return memberRepo.findById(id).orElse(null);
	}

	// 회원 수정
	@PutMapping("/update")
	public String update(@RequestBody MemberEntity member) {
		memberRepo.save(member);

		return "수정완료";
	}

	// 회원 삭제
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Integer id) {

		memberRepo.deleteById(id);

		return "삭제 완료";
	}

	// 키워드로 검색
	@GetMapping("/name/{name}")
	public List<MemberEntity> search(@PathVariable("name") String name) {

		return memberRepo.findByName(name);
	}

}
