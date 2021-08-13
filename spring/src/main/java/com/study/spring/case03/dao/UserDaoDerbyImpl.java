package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoDerbyImpl implements UserDao {
	public UserDaoDerbyImpl() {
		System.out.println("UserDaoDerbyImpl()");
	}

	@Override
	public void createUser() {
		System.out.println("Create Derby user ok!");
	}
}
