package com.test.restapi.starter.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class Users {
	
	@javax.persistence.Id
	/*@GeneratedValue(strategy=GenerationType.AUTO)*/
	private String Id;
	@Column(name="name")
	private String name;
	private String pwd;
	
	
	
	public Users() {
			
	}
	
	public Users(String Id,String name, String pwd) {
		super();
		this.Id=Id;
		this.name = name;
		this.pwd = pwd;
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	public String getUserId() {
		return name;
	}
	public void setUserId(String userId) {
		this.name = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
