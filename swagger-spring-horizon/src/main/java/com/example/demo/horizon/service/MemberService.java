package com.example.demo.horizon.service;

import java.util.List;

import com.example.demo.horizon.model.Member;

public interface MemberService {
	
	public Member createMember(Member m);
	public List<Member> displayMember();

}
