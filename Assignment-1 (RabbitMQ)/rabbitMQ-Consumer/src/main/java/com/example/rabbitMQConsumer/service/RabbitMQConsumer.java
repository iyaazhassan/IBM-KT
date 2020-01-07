package com.example.rabbitMQConsumer.service;

import java.util.Arrays;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.rabbitMQConsumer.model.Member;



@Component
public class RabbitMQConsumer {

	 @Autowired
	  RestTemplate restTemplate;
	
	@RabbitListener(queues = "${horizon.rabbitmq.queue}")
	public void recievedMessage(Member m) {
		System.out.println("Recieved Message From RabbitMQ: " + m);
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Member> entity = new HttpEntity<Member>(m,headers);
	      restTemplate.exchange("http://localhost:8095/api/create", HttpMethod.POST, entity, String.class).getBody();
		
	}
}
