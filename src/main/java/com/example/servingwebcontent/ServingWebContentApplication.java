package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EntityScan("com.example.servingwebcontent.controllers.models")

public class ServingWebContentApplication {
	public static void main(String[] args) {

		try {
			SpringApplication.run(ServingWebContentApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}