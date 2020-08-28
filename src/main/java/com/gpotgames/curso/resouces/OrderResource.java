package com.gpotgames.curso.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpotgames.curso.entities.Order;
import com.gpotgames.curso.service.OrderService;

@RestController
@RequestMapping(value= "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;

	
	@GetMapping
	public ResponseEntity<List<Order>> finall(){
		
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
