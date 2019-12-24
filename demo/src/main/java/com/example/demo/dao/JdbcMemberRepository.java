package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;


@Repository
public class JdbcMemberRepository implements MemberRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM member";
	
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		
		List<Member> result = new ArrayList<Member>();
		for(Map<String, Object> row:rows){
			Member mem = new Member();
			mem.setMemberId(((Member) row).getMemberId());
			mem.setPersonId(((Member) row).getPersonId());
			mem.setPrefix(((Member) row).getPrefix());
			mem.setFirstName(((Member) row).getFirstName());
			mem.setMiddleName(((Member) row).getMiddleName());
			mem.setLastName(((Member) row).getLastName());
			mem.setSuffix(((Member)row).getSuffix());
			mem.setGender(((Member) row).getGender());
			mem.setSsn(((Member) row).getSsn());
			//mem.setHorizonEmployeeIndicator(true);
			//emp.setEmpId((String)row.get("empId"));
			//emp.setEmpName((String)row.get("empName"));
			result.add(mem);
		}
		
		return result;
	}

	@Override
	public Member saveMember(Member m) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO members " +
				"(memberId,personId,prefix,firstName,middleName,lastName,suffix,dob,gender,ssn,horizonEmployeeIndicator) VALUES (?,?,?,?,?,?,?,?,?,?)" ;
		jdbcTemplate.update(sql, new Object[]{
				m.getMemberId(),m.getPersonId(),m.getPrefix(),m.getFirstName(),m.getMiddleName(),m.getLastName(),m.getSuffix(),null,m.getGender(),m.getSsn(),true
		});
		return m;
	}
	
	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Member updateMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
