package com.study.spring.case05.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect		//切麵
@Order(1)		//數字愈小愈先執行（order 預設數值為 int 最大值）
public class MyLoggerAspect {
//	PointCut		使用切入點定義 JoinPoint 連接點
	@Pointcut(value = "execution(public Integer com.study.spring.case05.aop.CalcImpl.*(..))")
	public void pt() {

	}

	@Pointcut(value = "execution(* com.study.spring.case05.aop.CalcImpl.div(..))")
	public void pt2() {

	}

/*//	前置通知
//	@Before(value = "execution(public Integer com.study.spring.case05.aop.CalcImpl.add(Integer, Integer))")		//切入點表達式
//	@Before(value = "execution(* com.study.spring.case05.aop.CalcImpl.*(..))")		//切入點表達式
//	@Before(value = "execution(* com.study.spring.case05.aop.CalcImpl.*(..))")		//切入點表達式
//	@Before(value = "execution(* com.study.spring.case05.aop.*.*(..))")		//切入點表達式
//	@Before(value = "execution(* *.*(..))")		//切入點表達式
//	@Before(value = "pt() && !pt2()")		//切入點表達式可支援 &&、||、!
	@Before(value = "pt()")		//切入點表達式
	public void before(JoinPoint joinPoint) {
		System.out.println("前置通知 -> ");
		String methodName = joinPoint.getSignature().getName();		//獲取方法
		Object[] args = joinPoint.getArgs();		//獲取方法參數
		System.out.printf("方法名稱：%s、方法參數：%s\n", methodName, Arrays.toString(args));
	}

//	後置通知		位於 finally 區段中，即不論有無錯誤發生皆會執行
	@After(value = "pt()")
	public void after() {
		System.out.println("後置通知 -> ");
	}

//	返回通知		可設定 returning 以接收方法的回傳值
	@AfterReturning(value = "pt()", returning = "result")
	public void afterReturning(Object result) {
		System.out.println("返回通知 -> result: " + result);
	}

//	異常通知		可設定 throwing 異常通知變數
	@AfterThrowing(value = "pt()", throwing = "ex")
	public void afterThrowing(Exception ex) {
		System.out.println("異常通知 -> ex: " + ex);
	}	*/

//	環繞通知
	@Around(value = "pt()")
	public Object around(ProceedingJoinPoint jointPoint) {
		Object result = null;
		try {
//			前置通知
			System.out.println("環繞通知 - 前置通知 ");
			result = jointPoint.proceed();		//執行業務邏輯之方法
//			返回通知
			System.out.println("環繞通知 - 返回通知 ");
		} catch (Throwable e) {
//			異常通知
			System.out.println("環繞通知 - 異常通知 " + e);
		} finally {
//			後置通知
			System.out.println("環繞通知 - 後置通知 ");
		}
		return result;
	}
}
