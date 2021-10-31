package com.technoelevate.javabasic.assignment1;

import java.util.Scanner;

public class AreaMethod {

	public static double area(double radius) {
		
		double area;
		double invalid= -1.0d;
		if(radius<0) {
			System.out.println("Invalid Input");
			return invalid;
		}else {
			area=(radius*4)/(3.14);
			System.out.println("Area Of Circle Is "+area);
			return area;
		}
	}
	
	public static double area(double x, double y) {
		
		double area;
		double invalid=-1.0;
		if(x<0||y<0) {
			System.out.println("Invalid Input");
			return invalid;
		}else {
			area=x*y;
			System.out.println("Area Of Rectangel Is "+area);
			return area;
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please Inter The Radius For Circle");
		double radius=s.nextDouble();
		area(radius);
		System.out.println("Please Inter The Side Of The Rectangel");
		double x=s.nextDouble();
		double y=s.nextDouble();
		area(x, y);

	}

}
