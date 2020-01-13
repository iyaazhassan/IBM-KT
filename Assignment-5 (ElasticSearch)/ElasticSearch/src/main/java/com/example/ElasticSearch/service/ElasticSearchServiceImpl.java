package com.example.ElasticSearch.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ElasticSearch.dao.ElasticSearchRepo;
import com.example.ElasticSearch.model.Member;

@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

	@Autowired
	private ElasticSearchRepo elasticRepo;
	
	@Override
	public Member saveMember(Member m) {
		// TODO Auto-generated method stub
		return elasticRepo.save(m);
	}

	@Override
	public Member searchMemberByUuid(String uuid) {
		// TODO Auto-generated method stub
		 Optional<Member> m =elasticRepo.findById(uuid);
		 Member m1 = m.get();
		 return m1;
	}

}
