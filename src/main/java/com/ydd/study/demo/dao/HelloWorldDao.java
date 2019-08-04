package com.ydd.study.demo.dao;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

@Component
@Log4j
public class HelloWorldDao {
	//private Logger log = Logger.getLogger(HelloWorldDao.class) ;
	public HelloWorldDao() {
		log.info("Hello init ...");
	}

	public String save(String name) {
		return "save <"+name+"> ...";
	}
}