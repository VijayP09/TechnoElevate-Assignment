package com.technoelevate.basicsjava.Polymorphism;

public class ChildClassPolymorphism extends ParentClassPolymorphism {
    @Override  
	public void calculation(int a,int b) {
		
		int sub;
		sub=a-b;
		System.out.println("Child class Polymorphism Executed");
		System.out.println("Addition of two numbers is: "+sub);
	}
}
