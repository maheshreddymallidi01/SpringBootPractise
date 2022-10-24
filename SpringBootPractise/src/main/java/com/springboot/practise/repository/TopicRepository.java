package com.springboot.practise.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.practise.controller.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
