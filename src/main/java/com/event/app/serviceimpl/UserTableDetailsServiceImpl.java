package com.event.app.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return userTableDetails.findAll();
	}

	@Override
	public Optional<User> getById(Long id) {
		// TODO Auto-generated method stub
		return userTableDetails.findById(id);
	}

	@Override
	public User insert(User user) {
		// TODO Auto-generated method stub
		return userTableDetails.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userTableDetails.save(user);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userTableDetails.deleteById(id);
	}

}
