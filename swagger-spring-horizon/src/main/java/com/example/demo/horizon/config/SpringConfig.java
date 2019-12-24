package com.example.demo.horizon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.horizon.service.MemberService;
import com.example.demo.horizon.service.MemberServiceImpl;

@Configuration 
public class SpringConfig { 

@Bean
public MemberService memberService() {
    return new MemberServiceImpl();
}

}
