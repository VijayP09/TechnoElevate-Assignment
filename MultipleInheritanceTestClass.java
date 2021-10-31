package com.technoelevate.basicsofjava.assignment1;

public class MultipleInheritanceTestClass implements MultipleInheritanceParent,MultipleInheritanceParent2{

	@Override
	public void display() {
		System.out.println("Method from Parent2");
	
		
	}

	@Override
	public void show() {
		System.out.println("method from Parent ");
		
	}

	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
		a=10;
		System.out.println(a);
	}

}
