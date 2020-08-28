package com.wesleylima.estudomongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleylima.estudomongo.domain.User;
import com.wesleylima.estudomongo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired private UserService service;
	
	@GetMapping
	ResponseEntity<List<User>> findAll() {
		List<User> users = service.findAll();
		
		return ResponseEntity.ok().body(users);
	}
}
