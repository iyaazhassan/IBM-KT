package com.example.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;


@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}
