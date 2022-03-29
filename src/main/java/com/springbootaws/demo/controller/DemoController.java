package com.springbootaws.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
	
	@Value("${application_developer_name}")
	private String developer_name;

	@GetMapping("/hello")
	public String demo() {
		return "Hello "+developer_name + "appliction running successfully";
	}
	
}
