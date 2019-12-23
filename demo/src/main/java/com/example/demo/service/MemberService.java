package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Member;


public interface MemberService {
	
	public Member createMember(Member m);
	public List<Member> displayMember();

}
