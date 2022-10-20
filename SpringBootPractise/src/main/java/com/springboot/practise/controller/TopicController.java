package com.springboot.practise.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopic() {
		return Arrays.asList(
				new Topic("Spring","SpringBoot Framework","Spring Framework Description"),
				new Topic("Java","J2EE","Java Description"),
				new Topic("React","React Library","React Library Description")
				);
	}

}
