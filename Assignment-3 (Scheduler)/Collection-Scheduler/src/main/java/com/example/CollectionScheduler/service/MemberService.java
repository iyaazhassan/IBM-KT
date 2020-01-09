package com.example.CollectionScheduler.service;

import java.util.List;

import com.example.CollectionScheduler.model.Member;

public interface MemberService {
	public List<Member> getAllMembers();
	public void createMember();
}
