package com.springboot.consumer.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.consumer.service.UserConsumerService;


@RestController
public class UserController {
	
	private static final  Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserConsumerService userService;
	
	
	@RequestMapping("/sayHello")
	@ResponseBody
	public String getAll(){
		return userService.getAll();
	}
	
}
