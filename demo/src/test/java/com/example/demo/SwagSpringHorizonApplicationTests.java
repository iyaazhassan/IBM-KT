package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SwagSpringHorizonApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void applicationContextTest() {
		SwagSpringHorizonApplication.main(new String[] {});
	}
	
	
}
