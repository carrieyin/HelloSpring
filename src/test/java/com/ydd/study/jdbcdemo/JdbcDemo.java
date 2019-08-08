package com.ydd.study.jdbcdemo;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JdbcDemo {
	
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

}
