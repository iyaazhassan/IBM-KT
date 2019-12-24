package com.example.demo.horizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.horizon.dao.JdbcMemberRepository;

import com.example.demo.horizon.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	public JdbcMemberRepository memberRepository;
	
	

	
	
	@Override
	public Member createMember(Member m) {
		// TODO Auto-generated method stub
		memberRepository.saveMember(m);
		return m;
	}

	@Override
	public List<Member> displayMember() {
		// TODO Auto-generated method stub
		return memberRepository.getAllMembers();
	}

}
