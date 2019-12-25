package com.example.demo.listener;


import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Member;

import java.util.List;

@Component
public class JobListener extends JobExecutionListenerSupport {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
           // System.out.println("In Completion Listener ..");
            List<Member> results = jdbcTemplate.query("SELECT memberId,personId,prefix,firstName,middleName,lastName,suffix,dob,gender,ssn,horizonEmployeeIndicator FROM members",
                    (rs,rowNum)->{
                        return new Member(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),
                                rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getBoolean(11));
                    }
            );
            //results.forEach(System.out::println);
        }
    }
}

