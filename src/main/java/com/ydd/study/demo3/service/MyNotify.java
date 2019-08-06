package com.ydd.study.demo3.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyNotify {

	@Before("execution(* com.ydd.study.demo3.service.impl.*ServiceImpl.*(..))")
	public void before(){
		System.out.println("这是前置通知!!");
	}
	

}
