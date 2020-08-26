package com.gpotgames.curso.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpotgames.curso.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finall(){
		User u = new User(1l,"maria","maria@gmail.com","99999","12345");
		return ResponseEntity.ok().body(u);
	}
	
}
