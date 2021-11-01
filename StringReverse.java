package com.technoelevate.javabasics.assignment1_11_21;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please inter your name");
		String str [] = new String[5];
		for(int i=0;i<str.length;i++) {
			str[i]=s.nextLine();
		}
		for (int a=str.length-1;a>=0;a--) {
			System.out.print(str[a]+" ");
		}
	}

}
