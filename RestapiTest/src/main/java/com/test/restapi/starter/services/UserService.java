package com.test.restapi.starter.services;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.test.restapi.starter.controller.Topics;
import com.test.restapi.starter.controller.Users;

@Service
public class UserService {



	@Autowired
	private UserRepo userrepo;
	
/*public String userAuthService(String userName, String pwd) {
		
	
	 Users user = userrepo.findOne(userName);
	
	 
	
	 if(userName.equals(user.getUserId()) && pwd.equals(user.getPwd()))
		 
		 return "user is valid";
	 
	 else
		 return "invalid user";
	
	}*/
	
	/*public Object userAuthService(String userName,String pwd) throws ParseException {
		

		JSONParser parser = new JSONParser(); 
		
		String valid="validuser";
		String invalid="invalid user";
		
		
			JSONObject json = new JSONObject();
		
		
		Users users= userrepo.findByName(userName);
		
		if(userName.equals(users.getUserId()) && pwd.equals(users.getPwd()))
		{
			
			json= (JSONObject) parser.parse(valid);
		
			return json;
		}
					
					Response
				      .status()
				      .entity("valid user")
				      .type(MediaType.APPLICATION_JSON_UTF8)
				      .build();		//return "user is valid";
		
		else
		{
			
			json= (JSONObject) parser.parse(invalid);
			
			return json;
	}
		}*/
}
