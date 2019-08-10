package com.ydd.study.jdbcdemo;

import java.beans.PropertyVetoException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ydd.study.jdbc.dao.UserDao;
import com.ydd.study.jdbc.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbc.xml")
public class JdbcDemoTest {
	@Resource(name="userDao")
	private UserDao user;
	
	@Test
	public void testJdbc() throws PropertyVetoException{
		ComboPooledDataSource datasource = new ComboPooledDataSource();	
		
		datasource.setDriverClass("com.mysql.jdbc.Driver");
		datasource.setJdbcUrl("jdbc:mysql:///test");
		datasource.setUser("root");
		datasource.setPassword("root");
		
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(datasource);
		
		String sql = "INSERT INTO userinfo VALUES(111, 'rose','USA')";
		jt.update(sql);
		
	}
	
	@Test
	public void testadd(){
		User u = new User();
		u.setName("张三");
		u.setAddr("BJS");
		user.save(u);
	}
	
	@Test
	public void testDelete(){
		
		user.delete(113);
	}
	
	
	
	
}
