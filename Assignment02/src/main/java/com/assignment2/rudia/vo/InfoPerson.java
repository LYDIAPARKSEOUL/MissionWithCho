package com.assignment2.rudia.vo;

public class InfoPerson {
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "InfoPerson [name=" + name + ", age=" + age + "]";
	}
	
}