package com.horizon.PostgreSQLCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horizon.PostgreSQLCRUD.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{

}
