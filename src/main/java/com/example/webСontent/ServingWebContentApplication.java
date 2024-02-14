package com.example.webСontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EntityScan("com.example.webСontent.models")

public class ServingWebContentApplication {
	public static void main(String[] args) {

		try {
			SpringApplication.run(ServingWebContentApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}