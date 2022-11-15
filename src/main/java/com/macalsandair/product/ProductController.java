package com.macalsandair.product;

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
public class ProductController {
	
	@GetMapping
	public Product getListOfAllProducts() {
		
		return null;
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id ) {
		
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<String> createProduct() {
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> changeTheWholeProduct (@PathVariable("id") Long id, Product product) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> changeDescriptionOfProduct (@PathVariable("id") Long id, String description) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> changeAmountOfProduct (@PathVariable("id") Long id, int amount) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	
	
	
	

}
