package com.example.demo.horizon.swaggerspringhorizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= {"com.example.demo.horizon"})
@EntityScan( basePackages = {"com.example.demo.horizon.api","com.example.demo.horizon.controller","com.example.demo.horizon.dao","com.example.demo.horizon.model","com.example.demo.horizon.service"} )

public class SwaggerSpringHorizonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringHorizonApplication.class, args);
	}

}
