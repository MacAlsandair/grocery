package com.macalsandair.goods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Product createProduct(@PathVariable("id") Long id ) {
		
		return null;
	}
	
	@PostMapping() 
		
	
	
	

}
