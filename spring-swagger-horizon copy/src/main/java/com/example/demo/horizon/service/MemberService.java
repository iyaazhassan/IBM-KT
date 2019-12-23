package com.example.demo.horizon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.horizon.model.Member;

public interface MemberService {
	
	public Member createMember(Member m);
	public List<Member> displayMember();

}
