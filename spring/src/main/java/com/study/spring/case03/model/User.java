package com.study.spring.case03.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:user.properties")
public class User {
//	@Value(value = "John")
	@Value("${user.name}")
	private String name;

//	@Value(value = "18")
	@Value("${user.age}")
	private Integer age;

//	@Value("#{${nickname : {'Happy', 'Enjoy'}}}")
	@Value("${user.nickname}")
	private String[] nickname;

	@Value("#{${subjects : {'國文', '英文', '數學', '國文'}}}")
	private Set<String> subjects;

//	@Value("#{${scores : {'100', '90', '100'}}}")
	@Value("#{'${user.scores}'.split(',')}")
	private List<Integer> scores;

//	@Value("#{${hobbies : {key1: 'Car', key2: 'Plane'}}}")
	@Value("#{${user.hobbies}}")
	private Map<String, String> hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	public Map<String, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<String, String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", nickname=" + Arrays.toString(nickname) + ", subjects="
				+ subjects + ", scores=" + scores + ", hobbies=" + hobbies + "]";
	}
}
