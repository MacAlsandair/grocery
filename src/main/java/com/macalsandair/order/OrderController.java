package com.macalsandair.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/product")
public class OrderController {
	
	@GetMapping
	public Order getListOfAllOrders() {
		
		return null;
	}
	
	@GetMapping
	public Order getListOfAllNonCompletedOrders() {
		
		return null;
	}
	
	@GetMapping("/{id}")
	public Order getOrder(@PathVariable("id") Long id ) {
		
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<String> createOrder() {
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> acceptOrder (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> declineOrder (@PathVariable("id") Long id, String rejection) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> completeOrder (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteOrder (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	
	
	
	

}
