package com.horizon.PostgreSQLCRUD.service;

import java.util.List;

import com.horizon.PostgreSQLCRUD.model.Member;

public interface MemberService {
	
	public Member createMember(Member m);
	public List<Member> displayAll();
	public Member update(Member m);
	public void delete(String uuid);
	

}
