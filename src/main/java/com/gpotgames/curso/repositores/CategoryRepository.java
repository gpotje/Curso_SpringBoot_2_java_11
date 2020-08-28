package com.gpotgames.curso.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotgames.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
