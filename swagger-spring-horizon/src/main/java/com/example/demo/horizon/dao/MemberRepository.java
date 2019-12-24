package com.example.demo.horizon.dao;



import java.util.List;



import com.example.demo.horizon.model.Member;

public interface MemberRepository {
	public List<Member> getAllMembers();
	public Member saveMember(Member m);
	public void deleteMember(String memberId);
	public Member updateMember(String memberId);

}
