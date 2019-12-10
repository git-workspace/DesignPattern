package com.example.demo.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String getHello() {
		return "index";
	}
}
