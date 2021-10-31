package com.technoelevate.javabasic.assignment1;
import java.util.Scanner;
public class PrintNumberInWordMainMethod {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please Inter Number");
		int num=s.nextInt();
		PrintNumberInWord.printNumberInWord(num);
	}

}
