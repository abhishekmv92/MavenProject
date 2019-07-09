package com.test.restapi.starter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test.restapi.starter.controller.Topics;
import com.test.restapi.starter.controller.Users;

@Service
public class TopicService {
	
	/*
	 * private List<Topics> topicList = new ArrayList<Topics>(Arrays.asList( new
	 * Topics("Java", "Java restAPI", "Java descrption1"), new Topics("Spring",
	 * "Spring restAPI", "Spring descrption1"), new Topics("JavaScript",
	 * "JavaScript restAPI", "JavaScript descrption1") ));
	 */
	
	@Autowired
	private DataBaseClass dataBaseService;
	
	
	public List<Topics> getAllList(){ 
		
		
		/* java 1.8 using lambda
		 * List<Topics> listOfTopics = new ArrayList<Topics>();
		 * dataBaseService.findAll().forEach(t -> listOfTopics.add(t));
		 * 
		 * return listOfTopics;
		 */ 
		
		return dataBaseService.findAll();
		
	}
	 
	
	public Topics getTopic(String id) {
		//return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		/*
		 * int j=0; for(int i=0; i<topicList.size(); i++) {
		 * if(topicList.get(i).getId().equals(id)) { j=i; } } return topicList.get(j);
		 */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataBaseService.findOne(id);
	}
	
	public void addtopic(Topics newTopic) {
		//topicList.add(newTopic);
		dataBaseService.save(newTopic);
	}

	
	public void update(Topics topic) {
		
		dataBaseService.save(topic);

		/*
		 * for (int i = 0; i < topicList.size(); i++) { if
		 * (topicList.get(i).getId().equals(id)) { topicList.set(i, topic); } }
		 */
	}
	
	
	 public void delete(String id) {
	 
		/*
		 * for(int i=0; i<topicList.size();i++) {
		 * if(topicList.get(i).getId().equals(id)) { topicList.remove(i); } }
		 */
		 
		 dataBaseService.delete(id);
	  
	  }



	 
}
