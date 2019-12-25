package com.example.demo.processor;




import org.springframework.batch.item.ItemProcessor;

import com.example.demo.model.Member;

public class MemberProcessor implements ItemProcessor<Member,Member> {

    @Override
    public Member process(final Member member) throws Exception {
        //System.out.println("Transforming Employee(s) to EmployeeDTO(s)..");
        final Member member1 = new Member(member.getMemberId(),member.getPersonId(),member.getPrefix(),member.getFirstName(),member.getMiddleName(),member.getLastName(),member.getSuffix(),member.getDob(),member.getGender(),member.getSsn(),true);
        return member1;
    }

}