package com.lq.springboot.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "teacher")
public class Person {

	private String lastName;
	private Integer age;
	private Boolean isBoss;
	private Map<String,Object> maps;
	private List<Object> lists;

	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", age=" + age +
				", isBoss=" + isBoss +
				", maps=" + maps +
				", lists=" + lists +
				'}';
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss1() {
		return isBoss;
	}

	public void setBoss1(Boolean boss) {
		isBoss = boss;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}


}
