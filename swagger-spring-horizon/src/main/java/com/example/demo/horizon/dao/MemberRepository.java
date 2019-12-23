package com.example.demo.horizon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.horizon.model.Member;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}
