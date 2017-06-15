package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RefreshScope
public class UserController {	

	@Autowired
	UserService userService;
	
	@RequestMapping( value = "${userService.getUser.url.mapping}")
	//@RequestMapping( value = "/")
	public User getUser(@RequestParam(value = "name", defaultValue = "World") String name) {
		return userService.getUser(name);
	}
}
