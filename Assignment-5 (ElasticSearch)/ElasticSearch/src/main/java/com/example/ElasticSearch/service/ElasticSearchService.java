package com.example.ElasticSearch.service;

import com.example.ElasticSearch.model.Member;

public interface ElasticSearchService {
	
	public Member saveMember(Member m);
	public Member searchMemberByUuid(String uuid);

}
