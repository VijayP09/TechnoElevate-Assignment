package com.technoelevate.javabasic.assignment1;
import java.util.Scanner;
public class MethodWith3Parameter {
	
	public static void printEqual(int a,int b, int c) {
		if(a<0||b<0||c<0) {
			System.out.println("Invalid Value");
		}else if(a==b&&b==c) {
			System.out.println("All Input Are Same");
		}else if(a!=b&&b!=c) {
			System.out.println("All Input Are Different");
		}else {
			System.out.println("Neither All Are Equal Nor Different ");
		}
	}

	public static void main(String[] args) {

		System.out.println("Please Inter a Input");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		printEqual(a, b, c);
	
				

	}

}
