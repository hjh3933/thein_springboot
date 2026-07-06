package com.example.demo.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.calculator.service.CalcService;

@RestController
public class CalcController {

	private final CalcService calcService;

	public CalcController(CalcService calcService) {
		this.calcService = calcService;
	}

	@GetMapping("/add")
	public int getMethodName(@RequestParam("a") int a, @RequestParam("b") int b) {
		return calcService.add(a, b);
	}

}
