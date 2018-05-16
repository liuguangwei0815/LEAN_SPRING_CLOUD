package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itmuch.cloud.vo.UserVo;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${user.servicePath}")
	private String servicePath;

	@GetMapping("/movice/{id}")
	public UserVo getUserById(@PathVariable Long id) {
		return restTemplate.getForObject(servicePath + id, UserVo.class);
	}

}
