package com.ydd.study.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ydd.study.demo2.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo2.xml")
public class JunitSpringTest {
	@Resource(name="user")
	private User u;
	
	@Test
	public void testfunc1(){
		System.out.println(u);
	}
}
