package com.horizon.PostgreSQLCRUD.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horizon.PostgreSQLCRUD.model.Member;
import com.horizon.PostgreSQLCRUD.service.MemberService;

import net.bytebuddy.implementation.bind.annotation.Pipe;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/display")
	public List<Member> getAllMembers(){
		return memberService.displayAll();
	}
	
	@PostMapping("/create")
	public Member createMember(@RequestBody Member m) {
		return memberService.createMember(m);
		
	}
	
	@PutMapping("/update")
	public Member updateMember(@RequestBody Member m) {
		return memberService.update(m);
	}
	
	@DeleteMapping("/delete/{uuid}")
	public void deleteMember(@PathVariable String uuid) {
		memberService.delete(uuid);
	}
	
	
	

}
