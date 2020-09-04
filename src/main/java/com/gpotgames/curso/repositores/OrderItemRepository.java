package com.gpotgames.curso.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotgames.curso.entities.OrdemItem;

public interface OrderItemRepository extends JpaRepository<OrdemItem, Long> {
	
	

}
