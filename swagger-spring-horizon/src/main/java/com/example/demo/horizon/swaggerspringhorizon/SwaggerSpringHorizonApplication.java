package com.example.demo.horizon.swaggerspringhorizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.horizon.service.MemberService;
import com.example.demo.horizon.service.MemberServiceImpl;

@SpringBootApplication
@ComponentScan("com.example.demo.horizon.controller")
public class SwaggerSpringHorizonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringHorizonApplication.class, args);
		
	}

}
