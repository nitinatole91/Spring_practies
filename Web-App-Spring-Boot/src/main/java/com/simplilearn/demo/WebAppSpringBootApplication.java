  package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebAppSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebAppSpringBootApplication.class, args);
		System.out.println(context.getClass().getName());
		
		System.out.println("Beans Loaded::"+context.getBeanDefinitionCount());
		
	}
	@GetMapping("/")
	public String welcome() {
		
		return "welcome to web Application";
	}

}
