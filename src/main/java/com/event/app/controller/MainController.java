package com.event.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.app.domain.User;
import com.event.app.service.UserTableDetailsService;

@RestController
public class MainController {
	
	@Autowired
	UserTableDetailsService userTableDetailsService;

	@GetMapping("/alluserdetails")
	public List<User> getUserDetails() {

		return userTableDetailsService.getAllUserDetails();

	}

}
