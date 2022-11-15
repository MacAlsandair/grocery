package com.macalsandair.goods;

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
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id ) {
		
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<String> createProduct(@PathVariable("id") Long id ) {
		
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> changeTheWholeProduct (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> changeThePartOfAProduct (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct (@PathVariable("id") Long id) {
		
		return new ResponseEntity<String> (HttpStatus.OK);
	}
	
	
	
	
	

}
