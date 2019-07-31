package com.event.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.app.domain.User;
import com.event.app.repository.UserTableDetails;
import com.event.app.service.UserTableDetailsService;
@Service
public class UserTableDetailsServiceImpl implements UserTableDetailsService {
	@Autowired
	UserTableDetails userTableDetails;

	@Override
	public List<User> getAllUserDetails() {
		return userTableDetails.findAll();
	}

}
