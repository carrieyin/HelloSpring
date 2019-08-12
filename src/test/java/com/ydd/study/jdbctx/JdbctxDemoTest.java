package com.ydd.study.jdbctx;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ydd.study.springtx.Service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springtx.xml")
public class JdbctxDemoTest {
	@Resource(name="accountService")
	private AccountService as;
	
	@Test
	public void testfunc(){
		as.transer(1, 2, 200);
	}

}
