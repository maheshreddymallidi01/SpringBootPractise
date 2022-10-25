package com.springboot.practise.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practise.controller.Course;
import com.springboot.practise.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("spring","spring","spring framework"),new Topic("java","java","j2ee framework"),new Topic("js","javascript","javascript framework")));
	 
	public List<Course> getAllCourses(String topicId){
		List<Course> courses=new ArrayList<>();
//		topicRepository.findAll().forEach(t->topics.add(t));
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}	
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
