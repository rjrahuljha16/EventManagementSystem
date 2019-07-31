package com.event.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.app.domain.User;
@Repository
public interface UserTableDetails extends JpaRepository<User, Long> {


}
