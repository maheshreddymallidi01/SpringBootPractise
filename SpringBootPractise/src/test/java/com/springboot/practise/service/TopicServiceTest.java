package com.springboot.practise.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.practise.controller.Topic;

class TopicServiceTest {
	
	
	private TopicService topicService;
	
	@BeforeEach
	void setUp() {
		this.topicService = new TopicService();
	}

	@Test
	void testGetAllTopics() {
		List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("Spring","SpringBoot Framework","Spring Framework Description"),
				new Topic("Java","Core Java","Core Java Description"),
				new Topic("React","React Library","React Library Description")
				));
		List<Topic> topicServiceTest = topicService.getAllTopics();
		assertEquals(topicServiceTest,topics);
	}

	@Test
	void testGetTopic() {
		Topic actual = new Topic("Java","Core Java","Core Java Description");
		Topic expected = topicService.getTopic("Java");
		assertEquals(actual, expected);
	}

	@Test
	void testAddTopic() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateTopic() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteTopic() {
		fail("Not yet implemented");
	}

}
