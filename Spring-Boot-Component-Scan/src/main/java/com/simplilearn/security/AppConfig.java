package com.simplilearn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
public AppConfig() {
	// TODO Auto-generated constructor stub
	System.out.println("appConfig :: contractor.");
}
	@Bean
	public Appsecurity createInstance() {
		Appsecurity as=new Appsecurity();
//		custom logic to scure our funtionality
		return as;
	}
}
