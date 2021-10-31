package com.technoelevate.basicsofjava.assignment1;

public class ArrayAverageCalculat {

	public static void main(String[] args) {
		int a[]= {20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("average of array="+sum/a.length);
	}

}
