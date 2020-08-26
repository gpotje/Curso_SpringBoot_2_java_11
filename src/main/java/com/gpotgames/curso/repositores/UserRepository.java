package com.gpotgames.curso.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotgames.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
