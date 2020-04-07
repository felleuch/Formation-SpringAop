package com.wha.aop;

import org.springframework.aop.ThrowsAdvice;

public class DoAfterThrowingExceptionMethod implements ThrowsAdvice {
	

	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("*********** Spring AOP **** DoAfterThrowingExceptionMethod : Executing when method throw exception !");
	}

}
