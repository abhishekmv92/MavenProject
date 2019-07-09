package com.test.restapi.starter.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.restapi.starter.controller.Users;


public interface UserRepo extends JpaRepository<Users, String> {
	
	public Users findByName(String name);

}
