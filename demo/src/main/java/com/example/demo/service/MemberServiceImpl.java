package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberRepository;
import com.example.demo.model.Member;



@Service

public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member createMember(Member m) {
		// TODO Auto-generated method stub
		memberRepository.save(m);
		return m;
	}

	@Override
	public List<Member> displayMember() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

}
