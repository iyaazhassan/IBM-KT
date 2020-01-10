package com.example.RestTemplateAPI2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApi2Application.class, args);
	}
	
	 @Bean
	 public RestTemplate restTemplate() {
	     return new RestTemplate();
	 }


}
