package com.gpotgames.curso.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotgames.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
