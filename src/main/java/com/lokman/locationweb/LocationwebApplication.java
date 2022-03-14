package com.lokman.locationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lokman.locationweb")
public class LocationwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationwebApplication.class, args);
	}

}
