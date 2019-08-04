package com.ydd.study.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ydd.study.demo.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class JunitSpringTest {
	@Resource(name="user")
	private User u;
	
	@Test
	public void testfunc1(){
		System.out.println(u);
	}

}
