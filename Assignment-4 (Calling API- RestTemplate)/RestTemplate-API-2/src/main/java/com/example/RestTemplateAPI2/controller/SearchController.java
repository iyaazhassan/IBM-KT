package com.example.RestTemplateAPI2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.RestTemplateAPI2.model.Member;



@RestController
@RequestMapping("/horizon")
public class SearchController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/search")
	public List<Member> findByCriteria(@RequestBody Member m){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Member> entity = new HttpEntity<Member>(m,headers);
		//restTemplate.exchange("http://localhost:8099/horizon/search", HttpMethod.POST, request, new ParameterizedTypeReference<List<Member>>() { });
		ResponseEntity<List<Member>> searchResponse =
		        restTemplate.exchange("http://localhost:8099/horizon/search",
		                    HttpMethod.POST, entity, new ParameterizedTypeReference<List<Member>>() {
		            });
		List<Member> result = searchResponse.getBody();
		return result;
	}

}
