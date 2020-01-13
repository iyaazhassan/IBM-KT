package com.example.ElasticSearch.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.ElasticSearch.model.Member;

@Repository
public interface ElasticSearchRepo extends ElasticsearchRepository<Member, String> {


}
