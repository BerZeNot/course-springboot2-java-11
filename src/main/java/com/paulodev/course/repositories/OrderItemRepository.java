package com.paulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
