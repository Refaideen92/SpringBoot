package com.java.apartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.apartment.modal.UserEntity;
import com.java.apartment.repository.UserRepository;



@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
		
	}
	
	@PostMapping("/user")
	public UserEntity addUser(@RequestBody UserEntity userEntity) {
		return userRepository.save(userEntity);
	}
}
