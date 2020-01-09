package com.example.CollectionScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CollectionSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionSchedulerApplication.class, args);
	}

}
