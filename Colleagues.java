package com.technoelevate.hashsetsortoperation;

public class Colleagues implements Comparable<Colleagues> {
	String name;
	int age;
	String relation;
	public Colleagues(String name, int age, String relation) {
		super();
		this.name = name;
		this.age = age;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "Colleagues [name=" + name + ", age=" + age + ", relation=" + relation + "]";
	}
	@Override
	public int compareTo(Colleagues o) {
		// TODO Auto-generated method stub
		return this.relation.compareTo(o.relation);
	}
	

}
