package com.study.spring.case04;

import java.util.List;

public interface PersonService {
	boolean append(Person person);

	List<Person> findAll();
}
