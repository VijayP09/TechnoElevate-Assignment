package com.technoelevate.basicsjava.factbyrecursion;

public class FactByRecursion {
    
	public static int fact(int num)
	{
		if (num==2)
		{
			return num;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) 
	{   
		int num=5;
		System.out.println("Factorial of "+num+ " is "+fact(num));
	}

		

	

}
