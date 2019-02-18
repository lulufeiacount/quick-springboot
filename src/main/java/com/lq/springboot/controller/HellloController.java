package com.lq.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

	@RequestMapping("/hello")
	public String hello(){
		return "hello world quick";
	}

}
