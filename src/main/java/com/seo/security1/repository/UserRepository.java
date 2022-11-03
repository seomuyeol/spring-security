package com.seo.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seo.security1.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUsername(String username);
}
