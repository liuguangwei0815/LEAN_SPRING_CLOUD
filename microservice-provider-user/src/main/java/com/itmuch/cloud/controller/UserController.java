package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.reposity.UserReposity;

@RestController
public class UserController {
	@Autowired
	private UserReposity userReposity;

	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return userReposity.findById(id).get();
	}
	

}
