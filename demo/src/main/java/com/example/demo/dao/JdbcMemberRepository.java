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
		 String sql = "SELECT * FROM members";

	        List<Member> members = jdbcTemplate.query(
	                sql,
	                new BeanPropertyRowMapper(Member.class));

	        return members;
	}

	@Override
	public Member saveMember(Member m) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO members " +
				"(memberId,personId,prefix,firstName,middleName,lastName,suffix,dob,gender,ssn,horizonEmployeeIndicator) VALUES (?,?,?,?,?,?,?,?,?,?,?)" ;
		jdbcTemplate.update(sql, new Object[]{
				m.getMemberId(),m.getPersonId(),m.getPrefix(),m.getFirstName(),m.getMiddleName(),m.getLastName(),m.getSuffix(),m.getDob(),m.getGender(),m.getSsn(),true
		});
		return m;
	}
	
	@Override
	public void deleteMember(String memberId) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from members where memberId = ?";
		jdbcTemplate.update(deleteQuery, memberId);

	}

	@Override
	public Member updateMember(Member m) {
		// TODO Auto-generated method stub
		
		String query="update members set firstName='"+m.getFirstName()+"',middleName='"+m.getMiddleName()+"',lastName='"+m.getLastName()+"' where memberId='"+m.getMemberId()+"' ";  
			    jdbcTemplate.update(query);  
		
//		         jdbcTemplate.update(
//		                "update members set firstName= ?,middleName=?,lastName=?, where memberId =?",
//		                m.getFirstName(),m.getMiddleName(),m.getLastName(),m.getMemberId());
		         return m;
		    
	}

}
