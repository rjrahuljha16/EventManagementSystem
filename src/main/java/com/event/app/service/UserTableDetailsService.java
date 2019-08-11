package com.event.app.service;

import java.util.List;
import java.util.Optional;

import com.event.app.domain.User;

public interface UserTableDetailsService {
	
	List<User> allUser();
	Optional<User> getById(Long id);
	User insert(User user);
	User update(User user);
	void delete(Long id);

}
