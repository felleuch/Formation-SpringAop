package com.wha.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DoAfterReturningMethod implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("*********** Spring AOP **** DoAfterReturningMethod : Executing after method return !");
		
	}

}
