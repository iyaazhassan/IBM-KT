package com.example.demo.dao;



import java.util.List;

import com.example.demo.model.Member;


public interface MemberRepository {
	public List<Member> getAllMembers();
	public Member saveMember(Member m);
	public void deleteMember(String memberId);
	public Member updateMember(String memberId);

}
