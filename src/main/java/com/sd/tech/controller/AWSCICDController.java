package com.sd.tech.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSCICDController {
	
	
	@GetMapping
	public ResponseEntity<String> getWelcome()
	{
		return new ResponseEntity<>("Hello Welcome to aws cicd ecs example...",HttpStatus.OK);
	}

}
