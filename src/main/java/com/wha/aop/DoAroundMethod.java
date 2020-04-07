package com.wha.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DoAroundMethod implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("*********** Spring AOP **** DoAroundMethod : method name :"+invocation.getMethod().getName());
		System.out.println("*********** Spring AOP **** DoAroundMethod : method arguments :"+invocation.getArguments());
		System.out.println("*********** Spring AOP **** DoAroundMethod : Before Method execution ");
		
		
		try {
			Object result = invocation.proceed();
			
			System.out.println("*********** Spring AOP **** DoAroundMethod : After Method execution ");
			return result;
		}catch(IllegalArgumentException e) {
			System.out.println("*********** Spring AOP **** DoAroundMethod : when method throw exception");
			throw e;
		}
							
	}

}



