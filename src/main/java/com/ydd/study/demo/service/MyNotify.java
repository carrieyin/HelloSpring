package com.ydd.study.demo.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyNotify {

	@Before("execution(* com.ydd.study.demo.service.*ServiceImpl.*(..))")
	public void before(){
		System.out.println("这是前置通知!!");
	}
	

}
