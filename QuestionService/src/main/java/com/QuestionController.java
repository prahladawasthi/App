package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
	
	@RequestMapping( value = "${questionService.getQuestion.url.mapping}")
	public String show(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hi " + name;
	}
}
