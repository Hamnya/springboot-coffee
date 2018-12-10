package com.hamnya.coffee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeRestController {
	
	@GetMapping("/hello")
	public String hello(){
			return "HELLO WORLD";
	}
}
