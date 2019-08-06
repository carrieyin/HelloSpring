package com.ydd.study.demo3;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ydd.study.demo3.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo3.xml")
public class SpringAopAnnotationTest {
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void  testFunc(){
		us.save();
	}

}
