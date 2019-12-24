package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;


@Repository
public class JdbcMemberRepository implements MemberRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Member> getAllMembers() {
		 String sql = "SELECT * FROM member";

	        List<Member> members = jdbcTemplate.query(
	                sql,
	                new BeanPropertyRowMapper(Member.class));

	        return members;
	}

	@Override
	public Member saveMember(Member m) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO member " +
				"(memberId,personId,prefix,firstName,middleName,lastName,suffix,dob,gender,ssn,horizonEmployeeIndicator) VALUES (?,?,?,?,?,?,?,?,?,?,?)" ;
		jdbcTemplate.update(sql, new Object[]{
				m.getMemberId(),m.getPersonId(),m.getPrefix(),m.getFirstName(),m.getMiddleName(),m.getLastName(),m.getSuffix(),m.getDob(),m.getGender(),m.getSsn(),true
		});
		return m;
	}
	
	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from member where memberId = ?";
		jdbcTemplate.update(deleteQuery, memberId);

	}

	@Override
	public Member updateMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
