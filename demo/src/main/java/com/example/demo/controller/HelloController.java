package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
public class HelloController {

// 단순연결
//	@Autowired
//	private HelloService helloService;

// final 키워드 사용할 수 있다.(생성자를 사용해야함)
	private final HelloService helloService;

	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	public String hello() {
		return helloService.hello();
	}

}
