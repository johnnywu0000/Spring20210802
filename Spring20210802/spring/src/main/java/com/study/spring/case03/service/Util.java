package com.study.spring.case03.service;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class Util {
	public Util() {
		System.out.println("Util()");
	}

	public Date getToday() {
		return new Date();
	}
}