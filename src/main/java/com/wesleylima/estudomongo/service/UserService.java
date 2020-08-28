package com.wesleylima.estudomongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleylima.estudomongo.domain.User;
import com.wesleylima.estudomongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
