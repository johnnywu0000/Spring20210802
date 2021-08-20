package com.study.spring.case05.proxy.dyn;

public class TestCalc {
	public static void main(String[] args) {
		Calc calc = (Calc) new ProxyUtil(new CalcImpl()).getProxy();
		System.out.println(calc.add(10, 20));
		System.out.println();
		System.out.println(calc.div(10, 0));
	}
}
