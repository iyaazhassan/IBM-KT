package com.example.demo.horizon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.horizon.model.Member;
import com.example.demo.horizon.service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/create")
	public Member createMember(@RequestBody Member m) {
		return memberService.createMember(m);
		
	}
	
	@GetMapping("/display")
	public List<Member> displayMember(){
		return memberService.displayMember();
	}
}
