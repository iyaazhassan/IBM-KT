package com.example.mongodbhorizon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbhorizon.dao.MemberRepository;
import com.example.mongodbhorizon.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	@Override
	public Member createMember(Member m) {
		// TODO Auto-generated method stub
		return memberRepository.save(m);
	}

	@Override
	public List<Member> displayMember() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		memberRepository.deleteById(memberId);

	}

	@Override
	public Member updateMember(Member m) {
		// TODO Auto-generated method stub
		Optional<Member> m1 = memberRepository.findById(m.getMemberId());
		Member m2=m1.get();
		m2.setFirstName(m.getFirstName());
		m2.setMiddleName(m.getMiddleName());
		m2.setLastName(m.getLastName());
		memberRepository.save(m2);
		return m;
	}

}
