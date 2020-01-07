package com.example.mongodbhorizon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodbhorizon.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {

}
