package com.technoelevate.javabasic.assignment1;

public class ForStatement {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=1;i<1000;i++) {
			if(i%3==0&&i%5==0) {
				count++;
				System.out.println("First Digit Is "+i);
				sum=sum+i;
				
			}
			if(count==5) {
				System.out.println("Sum Of First Five Digit Is "+sum);
				break;
			}
		}
	}

}
