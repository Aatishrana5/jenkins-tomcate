package com.example.jenkins_tomcate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JController {

	@RequestMapping("/test")
	public String hello() {
		return "Hello World!";
	}
}
