package com.example.mongodbhorizon.service;

import java.util.List;

import com.example.mongodbhorizon.model.Member;


public interface MemberService {

	public Member createMember(Member m);
	public List<Member> displayMember();
	public void deleteMember(String memberId);
	public Member updateMember(Member m);

}
