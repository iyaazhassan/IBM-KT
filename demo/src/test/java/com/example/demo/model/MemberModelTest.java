package com.example.demo.model;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.SwagSpringHorizonApplication;
import com.example.demo.model.Member;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SwagSpringHorizonApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberModelTest {

	@Autowired
	private Environment env;
	private MockMvc mockMvc;
	org.slf4j.Logger log = LoggerFactory.getLogger(SwagSpringHorizonApplication.class);
	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		log.info("context loaded sucessfully... Listening on port: " + env.getProperty("server.port"));
	}
	
	
	@Test
    public void testMemberToString()
    {
        Member m = new Member(); // you didn't supply the object, so I guessed
        //String expected = "{class Member \nmemberId:null\npersonId:null\nprefix:null\nfirstName:null\nmiddleName:null\nlastName:null\nsuffix:null\ndob:null\ngender:null\nssn:null\nhorizonEmployeeIndicator:null\nlinks:null\n}"; // put the expected value here
        String notexpected ="";
        Assert.assertNotEquals(notexpected, m.toString());
    }
	
	@Test
    public void testLinkModel()
    {
        Link l = new Link(); // you didn't supply the object, so I guessed
        //String expected = "{class Member \nmemberId:null\npersonId:null\nprefix:null\nfirstName:null\nmiddleName:null\nlastName:null\nsuffix:null\ndob:null\ngender:null\nssn:null\nhorizonEmployeeIndicator:null\nlinks:null\n}"; // put the expected value here
        String notexpected ="";
        Assert.assertNotEquals(notexpected, l.toString());
    }
	
	@Test
    public void testLinkModelSettersandGetters()
    {
        Link l = new Link(); // you didn't supply the object, so I guessed
        l.rel("rel");
        l.href("href");
        //String expected = "{class Member \nmemberId:null\npersonId:null\nprefix:null\nfirstName:null\nmiddleName:null\nlastName:null\nsuffix:null\ndob:null\ngender:null\nssn:null\nhorizonEmployeeIndicator:null\nlinks:null\n}"; // put the expected value here
        String href ="href";
        String rel="rel";
        Link l1 = new Link();
        l1.setRel("rel");
        l1.setHref("href");
        Assert.assertEquals(href, l.getHref());
        Assert.assertEquals(rel, l.getRel());
        Assert.assertEquals(href, l1.getHref());
        Assert.assertEquals(rel, l1.getRel());
    }
	
	@Test
	public void testLinkModelequals()
    {
        Link l = new Link(); // you didn't supply the object, so I guessed
       
        Assert.assertEquals(true, l.equals(l));
        
    }
	
	@Test
	public void testLinkModelequalsobject()
    {
		Link l1 = new Link();
        Object l = new Object(); // you didn't supply the object, so I guessed
       
        Assert.assertEquals(false, l1.equals(l));
        
    }
	
	@Test
	public void testMemberModelequalsobject()
    {
		Member m = new Member();
        Object l = new Object(); // you didn't supply the object, so I guessed
       
        Assert.assertEquals(false, m.equals(l));
        
    }
	
	@Test
	public void testMemberModelequals()
    {
		Member m = new Member(); // you didn't supply the object, so I guessed
       
        Assert.assertEquals(true, m.equals(m));
        
    }
	
	@Test
	public void testMemberModelhashcode()
    {
		Member m = new Member(); // you didn't supply the object, so I guessed
       
        Assert.assertNotEquals(1, m.hashCode());
        
    }
	
	@Test
	public void testLinkModelhashcode()
    {
		 // you didn't supply the object, so I guessed
		Link l = new Link();
        Assert.assertNotEquals(1, l.hashCode());
        
    }
	
	@Test
	public void testLinkModeltoIntendedString()
    {
		 // you didn't supply the object, so I guessed
		Link l = new Link();
		//Object o = new Object();
        Assert.assertNotEquals(1, l.toIndentedString("hii\n"));
        
    }
	
	@Test
	public void testMemberModeltoIntendedString()
    {
		 // you didn't supply the object, so I guessed
		Member m = new Member();
		//Object o = new Object();
        Assert.assertNotEquals(1, m.toIndentedString("hii\n"));
        
    }
	
	@Test
	public void testMemberModelequalsobjectcase2()
    {
		Member m = new Member("m001",
				"p001",
				"Mr.",
				"Iyaaz",
				"Hassan",
				"Mohtisham",
				".",
				"01-03-1997",
				"Male",
				"s001",
				true);
		
        Object o = (Object)m; // you didn't supply the object, so I guessed
       
        Assert.assertEquals(true, m.equals(o));
        
    }
	
	
	

}