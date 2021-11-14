package com.technoelevate.basicsjava.arrayprograms;

public class PrintArray {
    public static <nextInt> void printarray() {
    	int a[]= {10,20,30,30,50,60,60};
    	
    	for (int i=0;i<a.length;i++) {
    		System.out.println(a[i]);
    	}
    }
    
	public static void main(String[] args) {
		printarray();
        float []b= {10.7f,20.4f,40,3f,70.8f};
        float sum=0;
        for (int j=0;j<b.length;j++) {
        	sum=sum+b[j];
        }
        System.out.println(sum);
	}

}
