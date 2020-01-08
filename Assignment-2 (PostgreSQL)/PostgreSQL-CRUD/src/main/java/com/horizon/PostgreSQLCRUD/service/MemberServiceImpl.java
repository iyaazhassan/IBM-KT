package com.horizon.PostgreSQLCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horizon.PostgreSQLCRUD.model.Member;
import com.horizon.PostgreSQLCRUD.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public Member createMember(Member m) {
		// TODO Auto-generated method stub
		return memberRepo.save(m);

	}

	@Override
	public List<Member> displayAll() {
		// TODO Auto-generated method stub
		return memberRepo.findAll();
	}

	@Override
	public Member update(Member m) {
		// TODO Auto-generated method stub
		Optional<Member> m1 = memberRepo.findById(m.getUuid());
		Member m2 = m1.get();
		m2.setFirstName(m.getFirstName());
		m2.setMiddleName(m.getMiddleName());
		m2.setLastName(m.getLastName());
		memberRepo.save(m2);
		return m2;
		
	}

	@Override
	public void delete(String uuid) {
		// TODO Auto-generated method stub
		memberRepo.deleteById(uuid);

	}

}
