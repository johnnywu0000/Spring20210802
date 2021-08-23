package com.study.spring.case05.aopxml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyLoggerXMLAspect {
	public void before(JoinPoint joinPoint) {
		System.out.println("AOP XML 前置通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱：%s、方法參數：%s\n", methodName, Arrays.toString(args));
	}
}
