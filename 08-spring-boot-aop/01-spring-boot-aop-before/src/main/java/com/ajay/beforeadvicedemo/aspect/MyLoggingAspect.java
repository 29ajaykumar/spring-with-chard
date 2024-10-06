package com.ajay.beforeadvicedemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.ajay.beforeadvicedemo.dao.AccountDAOImp.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	//@Before("execution(public * add*())")
	//@Before("execution(* add*())")
	//@Before("execution(public * com.ajay.beforeadvicedemo.dao.AccountDAOImp.*())")
	//@Before("execution(* add*(..))")
	@Before("execution(* add*(String,..))")
	public void beforeAdviceAddAccount() {
		System.out.println("Execution befor advice on public void addAccount()");
	}
}
