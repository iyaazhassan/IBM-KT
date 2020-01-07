package com.example.rabbitMQProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitMQProducer.model.Member;
import com.example.rabbitMQProducer.service.RabbitMQSender;


@RestController
@RequestMapping("/horizon")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@PostMapping("/createMember")
	public String producer(@RequestBody Member m) {
		rabbitMQSender.send(m);
		return "Message sent to the RabbitMQ Successfully";
	}

}
