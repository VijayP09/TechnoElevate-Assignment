package com.technoelevate.hashsetsortoperation;

public class Family implements Comparable<Family> {
      String name;
      String relation;
      int age;
	public Family(String name, String relation, int age) {
		super();
		this.name = name;
		this.relation = relation;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Family [name=" + name + ", relation=" + relation + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Family o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	} 
      
}
