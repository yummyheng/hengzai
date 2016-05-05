package com.yummy.first;

import com.google.common.collect.ComparisonChain;

public class TestBeanFather implements Comparable<TestBeanFather> {
	private String name;
	private String gender;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public int compareTo(TestBeanFather o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
