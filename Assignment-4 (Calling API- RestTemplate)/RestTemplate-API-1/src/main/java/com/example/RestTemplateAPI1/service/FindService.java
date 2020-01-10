package com.example.RestTemplateAPI1.service;

import java.util.List;

import com.example.RestTemplateAPI1.model.Member;

public interface FindService {
	public List<Member> findByCriteria(Member m);
}
