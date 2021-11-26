package com.paulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
