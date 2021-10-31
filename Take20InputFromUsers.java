package com.technoelevate.basicsofjava.assignment1;
import java.util.Scanner;
public class Take20InputFromUsers {

		public static void main(String[] args) {
			int n =20;
			int count=0;
			Scanner sc=new Scanner(System.in);
	        int []num=new int[n];
	        System.out.println("Enter the Number Of Elements ");
	        for (int i=0;i<n;i++) {
	        	num[i]=sc.nextInt();
	        } 
	        
	          for (int i=0;i<n;i++) {
	        	   if (num[i]>0) {
	        		  count++ ;  
	        	  }
	          }
	          System.out.println("Number of Positive Numbers is "+count);
	         count=0;
	        for (int i=0;i<n;i++) {
	        	
	      	  if (num[i]<0) {
	      		  count++;  
	      	  }
	        }
	        System.out.println("Number of Negative Numbers is "+count);
	        count = 0;
	       for (int i=0;i<n;i++) {
	    	   if (num[i]%2==0) {
	    		   count++;
	    		   }
	       }
	       System.out.println("Number of Even Numbers is "+count);
	       count = 0;
	       for (int i=0;i<n;i++) {
	    	   if (num[i]%2!=0) {
	    		   count++;
	    		   }
	       }
	       System.out.println("Number of Odd Numbers is "+count);
	      count=0;
	      for (int i=0;i<n;i++) {
	   	   if (num[i]==0) {
	   		   count++;
	   		   }
	      }
	      System.out.println("Number of zero Numbers is "+count);
	      
		}

	}
