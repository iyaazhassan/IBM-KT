package com.example.RestTemplateAPI1.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTemplateAPI1.model.Member;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
	
	public List<Member> findByFirstNameOrLastNameOrDob(String firstname, String lastname, String dob);
	

}
