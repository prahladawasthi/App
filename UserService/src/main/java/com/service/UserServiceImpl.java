package com.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Override
	public User getUser(String name) {
		return new User(counter.incrementAndGet(), String.format(template, name));
	}
}
