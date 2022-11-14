package com.macalsandair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//this little class should do fast all the template work on our site, while the rest
// of our controllers will only send restful jsons

@Controller
public class TemplateController {

	@GetMapping("/")
	public String getIndexPage(Model model) {
		//TODO create a start page logic
		return "index";
	}
	
	@GetMapping("/catalog")
	public String getCatalog(Model model) {
		//TODO catalog logic
		return "catalog";
	}
	
	@GetMapping("/about-us")
	public String getAboutUs(Model model) {
		//TODO create simple "about us"
		return "about-us";
	}
	
	@GetMapping("/product/{id}/view")
	public String getProductPage(Model model) {
		//TODO create a page of a product
		return "product-page";
	}
	
	@GetMapping("/shopping-cart")
	public String getShoppingCart(Model model) {
		//TODO create a page of a product
		return "shopping-cart";
	}
	
	@GetMapping("/product/")
	public String getLogin(Model model) {
		//TODO create a login page
		return "login";
	}
	
}
