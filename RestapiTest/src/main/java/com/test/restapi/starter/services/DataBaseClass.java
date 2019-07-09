package com.test.restapi.starter.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.test.restapi.starter.controller.Topics;

public interface DataBaseClass extends JpaRepository<Topics, String> {

}
