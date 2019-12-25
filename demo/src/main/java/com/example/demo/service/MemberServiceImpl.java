package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JdbcMemberRepository;
import com.example.demo.model.Member;





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

	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		memberRepository.deleteMember(memberId);
		
	}

	@Override
	public Member updateMember(Member m) {
		return memberRepository.updateMember(m);
	}

}
