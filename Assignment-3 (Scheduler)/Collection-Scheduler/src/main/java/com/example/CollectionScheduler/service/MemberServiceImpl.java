package com.example.CollectionScheduler.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.CollectionScheduler.dao.Member1Repository;
import com.example.CollectionScheduler.dao.MemberRepository;
import com.example.CollectionScheduler.model.Member;
import com.example.CollectionScheduler.model.Member1;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	private static List<Member> MemberList;
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private Member1Repository member1Repository;
	
	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

	
	@Override
	@Scheduled(initialDelay = 1000, fixedRate = 30000)
	public void createMember() {
		MemberList = this.getAllMembers();
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numberOfElements = 2;
		for (int i = 0; i < numberOfElements; i++) {
			System.out.println("Member Fetch");
			Member randomMember = MemberList.get(rand.nextInt(MemberList.size()));
			if(member1Repository.existsById(randomMember.getUuid())) {
				System.out.println("Member Exists");
			}
			else {
				System.out.println("Saved");
				mongoTemplate.insert(randomMember,"member1");
				//member1Repository.save(m);
			}
			
	    }
	    
		
	}

}
