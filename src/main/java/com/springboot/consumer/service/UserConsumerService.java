package com.springboot.consumer.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springboot.producter.service.UserService;

@Service
public class UserConsumerService {

	private static final Logger logger = LoggerFactory.getLogger(UserConsumerService.class);
	
	@Resource
	private UserService userService;
	
	public String getAll(){		
		String all = userService.sayHello();
		logger.info("dubbo 返回结果all：{}",all);
		return all;
	}
}
