package com.example.CollectionScheduler.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.CollectionScheduler.model.Member1;

@Repository
public interface Member1Repository extends MongoRepository<Member1, String> {

}
