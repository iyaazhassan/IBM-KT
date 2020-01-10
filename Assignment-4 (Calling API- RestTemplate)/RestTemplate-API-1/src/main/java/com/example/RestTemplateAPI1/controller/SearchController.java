package com.example.RestTemplateAPI1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestTemplateAPI1.model.Member;
import com.example.RestTemplateAPI1.service.FindService;

@RestController
@RequestMapping("/horizon")
public class SearchController {
	
	@Autowired
	private FindService findService;
	
	@PostMapping("/search")
	public List<Member> findByCriteria(@RequestBody Member m){
		return findService.findByCriteria(m);
	}

}
