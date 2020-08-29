package com.gpotgames.curso.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotgames.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
