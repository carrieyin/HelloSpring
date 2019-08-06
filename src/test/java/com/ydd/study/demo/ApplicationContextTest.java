package com.ydd.study.demo;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ydd.study.demo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo.xml")
public class ApplicationContextTest {
	@Resource(name="userService")
	private UserService userService;
	
	@Test
	public void testFunc(){
		System.out.println("==============> " + userService.getClass().getName());
		userService.save();
	}

}
