package com.example.RestTemplateAPI1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestTemplateAPI1.dao.MemberRepository;
import com.example.RestTemplateAPI1.model.Member;

@Service
public class FindServiceImpl implements FindService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<Member> findByCriteria(Member m) {
		// TODO Auto-generated method stub
		if(m.getFirstName()==null) {
			m.setFirstName("");
			
		}
		if(m.getLastName()==null) {
			m.setLastName("");
			
		}
		if(m.getDob()==null) {
			m.setDob("");
		}
		System.out.println(m.getFirstName());
		System.out.println(m.getLastName());
		System.out.println(m.getDob());
		
		return memberRepository.findByFirstNameOrLastNameOrDob(m.getFirstName(), m.getLastName(), m.getDob());
		
	}

}
