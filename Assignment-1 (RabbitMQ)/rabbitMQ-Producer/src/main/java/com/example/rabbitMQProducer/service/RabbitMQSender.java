package com.example.rabbitMQProducer.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.rabbitMQProducer.model.Member;


@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${horizon.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${horizon.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Member m) {
		rabbitTemplate.convertAndSend(exchange, routingkey, m);
		System.out.println("Send msg = " + m);
	    
	}
}