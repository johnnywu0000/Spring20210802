package com.study.spring.case04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public boolean append(Person person) {
		return personDao.add(person);
	}

	@Override
	public List<Person> findAll() {
		List<Person> people = personDao.queryAll();
		if (people == null) {
			return new ArrayList<Person>();
		}
		return people;
	}

}