package com.study.spring.case05.aop_dancer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
//	切面表達式可指向 interface
	@Before("execution(* com.study.spring.case05.aop_dancer.Performance.perform(..))")
	public void slienceCellPhone() {
		System.out.println("手機靜音");
	}

	@Before("execution(* com.study.spring.case05.aop_dancer.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("對號入座");
	}

	@AfterReturning("execution(* com.study.spring.case05.aop_dancer.Performance.perform(..))")
	public void applause() {
		System.out.println("掌聲鼓勵");
	}

	@AfterThrowing("execution(* com.study.spring.case05.aop_dancer.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("要求退票");
	}

	@After("execution(* com.study.spring.case05.aop_dancer.Performance.perform(..))")
	public void exit() {
		System.out.println("離開");
	}
}