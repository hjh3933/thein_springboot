package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String hello() {
		return "안녕하세요~ 스프링 부트 수업중~~";
	}

}
