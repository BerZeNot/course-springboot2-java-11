package com.paulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
