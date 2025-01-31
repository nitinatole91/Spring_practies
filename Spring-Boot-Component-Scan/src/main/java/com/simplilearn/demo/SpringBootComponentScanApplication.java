package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.simplilearn.security.Appsecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"com.simplilearn","com.wallmart"})
public class SpringBootComponentScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComponentScanApplication.class, args);
	}
	
}
