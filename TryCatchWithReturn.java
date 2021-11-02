package com.technoelevate.javabasic.assignment2;

public class TryCatchWithReturn {

	public static void main(String[] args) {
		returnStatement();
	}
	
	public static int returnStatement() {
		int a=100;
		int b=0;
		
		try {
			System.out.println("My Name Is Prajwal");
			int result=a/b;
			System.out.println(result);
			return result;
		}
		
		catch(ArithmeticException e) {
			System.out.println("I am 22 Year Old");
			return 0;
		}
		
		finally  {
			System.out.println("My Nick Name Is Pk");
		}
	}

}
