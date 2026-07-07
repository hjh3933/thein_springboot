package com.hjh.batis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hjh.batis.model.Member;
import com.hjh.batis.service.MyService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MyController {
	private final MyService myService;

	@GetMapping("/member")
	public List<Member> getMember() {
		List<Member> list = myService.selectMember();
		return list;
	}

	@PostMapping("/insertMember")
	public void postMethodName(@RequestBody Member member) {

		myService.insertMember(member);
	}

}
