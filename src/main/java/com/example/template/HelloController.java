package com.example.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {

	 @GetMapping("/home")
		public String index() {
			return "Hello World with Spring Boot Test?";
		}
}
