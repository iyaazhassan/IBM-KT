package com.example.demo.horizon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.horizon.model.Member;
import com.example.demo.horizon.service.MemberService;
import com.example.demo.horizon.service.MemberServiceImpl;

@Controller
public class MemberController {
	
	@Autowired
	private MemberServiceImpl memberService;
	
	@PostMapping("/create")
	public Member createMember(@RequestBody Member m) {
		return memberService.createMember(m);
		
	}
	
	@GetMapping("/display")
	public List<Member> displayMember(){
		return memberService.displayMember();
	}
}
