package com.technoelevate.basicsjava.collectionarraylist.arraylistiteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteratorAssignment {

	public static void main(String[] args) {
		
	List<Integer> arraylist=new ArrayList();
		
		for (int i=0;i<10;i++) {
			arraylist.add(i);
		}
		ListIterator<Integer> listIterator=arraylist.listIterator();
		while (listIterator.hasNext()) {
			int i=(Integer)listIterator.next();
			System.out.println(i+" ");
			
			if (i%2==0) {
				i++;
				listIterator.set(i);
				listIterator.add(i);
			}
		}
		System.out.println();
		System.out.println(arraylist);
		System.out.println();
		
		while (listIterator.hasPrevious()) {
			
			System.out.print(listIterator.previous()+" ");
			
		}
		
				System.out.println();
		
	}

}
