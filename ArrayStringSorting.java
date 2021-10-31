package com.technoelevate.basicsofjava.assignment1;

import java.util.Arrays;

public class ArrayStringSorting {

	public static void main(String[] args) {
		 String[] array= {"Java", "Python", "PHP", "C", "C Programming", "C++"};        
		    System.out.println("Original Array String : "+Arrays.toString(array));
		    Arrays.sort(array);
		    System.out.println("Sorted string array : "+Arrays.toString(array));
		    }

	}
