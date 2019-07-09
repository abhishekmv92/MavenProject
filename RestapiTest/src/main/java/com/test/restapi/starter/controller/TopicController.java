package com.test.restapi.starter.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.restapi.starter.services.TopicService;
import com.test.restapi.starter.services.UserService;

@RestController
@RequestMapping(value="/myapp")
@ResponseBody
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	@Autowired
	private UserService userService;

	
	  @RequestMapping(method=RequestMethod.GET, value="/topics") 
	  public List<Topics> getAllTopics()
	  {
		  return topicService.getAllList(); 
		  
	  }
	 
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{id}")
	public Topics getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicService.addtopic(topic);
	}
	
	
	 @RequestMapping(method=RequestMethod.PUT, value="/topics") 
	 public void
	 updateTopic( @RequestBody Topics topic) {
	 topicService.update(topic); }
	 
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.delete(id);
	}
	
	
	
	
	
	/*@RequestMapping(method=RequestMethod.GET, value="/userauth/{userName}/{pwd}", produces = "application/json")
	public Object userAuth(@PathVariable("userName") String userName, @PathVariable("pwd") String pwd) {
		Object obj = null;
		try {
			obj= userService.userAuthService(userName,pwd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
	*/
/*	@RequestMapping(method=RequestMethod.GET, value="/userauth/{userName}/{}")
	public Users userAuth(@PathVariable String userName) {
		
		return userService.userAuthService(userName);
		
	}*/
	 
}
