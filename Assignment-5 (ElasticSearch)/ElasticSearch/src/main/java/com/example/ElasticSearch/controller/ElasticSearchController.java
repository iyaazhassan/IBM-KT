package com.example.ElasticSearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ElasticSearch.model.Member;
import com.example.ElasticSearch.service.ElasticSearchService;

@RestController
@RequestMapping("/horizon")
public class ElasticSearchController {

	@Autowired
	private ElasticSearchService elsearch;
	
	@PostMapping("/save")
	public Member saveMember(@RequestBody Member m) {
		//System.out.println(m);
		return elsearch.saveMember(m);	
	}
	
	@GetMapping("/search/{uuid}")
	public Member searchMember(@PathVariable String uuid) {
		return elsearch.searchMemberByUuid(uuid);
	}
}
