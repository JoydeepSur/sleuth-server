package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("sleuth/hello")
@Log4j2
public class HelloController {

	
	@GetMapping("/server")
	public String hello() {
		log.info("reached server");
		return "Hello Sleuth!!";
	}
}
