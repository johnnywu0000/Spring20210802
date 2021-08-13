package com.study.spring.case03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.study.spring.case03.dao.UserDao;
import com.study.spring.case03.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {

//	private UserDao userDao = new UserDaoImpl();

//	自動裝配順序為 byType 後再進行 byName
	@Autowired
	@Qualifier(value = "userDaoDerbyImpl")
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}

	@Override
	public void addUser() {
		userDao.createUser();
	}

}