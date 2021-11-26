package com.paulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
