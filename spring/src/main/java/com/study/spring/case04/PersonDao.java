package com.study.spring.case04;

import java.util.List;

public interface PersonDao {
	public boolean add(Person person);

	public List<Person> queryAll();
}
