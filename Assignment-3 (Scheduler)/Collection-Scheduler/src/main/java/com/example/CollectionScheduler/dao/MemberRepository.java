package com.example.CollectionScheduler.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CollectionScheduler.model.Member;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}
