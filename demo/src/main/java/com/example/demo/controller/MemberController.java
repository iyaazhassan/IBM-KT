package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;


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
	
	@DeleteMapping("/delete/{memberId}")
	public void deleteMember(@PathVariable String memberId) {
		memberService.deleteMember(memberId);
	}
}
