package com.technoelevate.basicsjava.alltypesofblockexceptioon;

public class AllBlocksTryCatchFinallyNestedTry {

	public static void main(String[] args) {
		
//		try {
//			System.out.println(10/0);
//		}
		
//		catch(ArithmeticException) {
//			System.out.println("Catch Block");
//		}
		
//		finally {
//			System.out.println("Finally Block");
//		}
		
		try {
			try {
				System.out.println(10/0);
			}catch(ArithmeticException e) {
				System.out.println("Inner Try");
			}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Outer Try");
	}
	
		try {
			System.out.println("Try Block");
		}finally {
			System.out.println("Finnaly Block");
		}
	}
}

