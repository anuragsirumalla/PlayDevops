package com.playdevops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.playdevops.service.HelloService;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;
	@GetMapping("/say-hello")
	public ResponseEntity<String> sayHelloToWorld(){
		String message = this.helloService.sayHello();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
