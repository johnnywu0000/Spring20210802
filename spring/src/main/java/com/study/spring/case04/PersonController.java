package com.study.spring.case04;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	public boolean addPerson(String name, Date birth) {
		Person person = new Person();
		person.setName(name);
		// honework: 請計算 age (today - birth) 取 year
		person.setAge(0);
		person.setBirth(birth);
		return personService.append(person);
	}

	public List<Person> queryPerson() {
		return personService.findAll();
	}

}