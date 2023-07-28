package com.aop.aspects_oriented_prog.advices;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.aop.aspects_oriented_prog.services.Login;
import com.aop.aspects_oriented_prog.services.LoginImpl;

@Aspect
public class MyAspect{

	@Before("execution(* com.aop.aspects_oriented_prog.services.LoginImpl.login())")
	public void executeBeforeLogin() {
		System.out.println("User Being Authenticated...");
		
	}
}
