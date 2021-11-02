package com.technoelevate.basicsjava.alltypesexception;

public class AllTypesException {

	public static void main(String[] args) {
		
		int a=10,b=0;
		int p[]= {10,0,30};
		String str[]= null;
		int c[]=new int[4];

		try {
			System.out.println(a/b);
			for (int i=0;i<=p.length;i++) {
				  System.out.println(p.length);
				  System.out.println(str.length);
				
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bond exception");
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic exception");
		}catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}catch (ArrayStoreException e) {
			System.out.println("Array Store Exception");
		}

	}

}
