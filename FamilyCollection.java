package com.technoelevate.hashsetsortoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FamilyCollection {

	public static void main(String[] args) {
		HashSet<Family> set=new HashSet<Family>();
		set.add(new Family("Sarjerao","Father", 58));
		set.add(new Family("Kalpana","Mother", 45));
		set.add(new Family("Sanjivani","Sister", 27));
		set.add(new Family("Monali","Sister",25));
		set.add(new Family("Siddhanath","Brother", 20));
		set.add(new Family("Ganpat","GrandFather", 60));
		set.add(new Family("Jijabai","GrandMother", 56));
		set.add(new Family("Vijay","I", 22));
		ArrayList<Family> list=new ArrayList<Family>(set);
		System.out.println(list);
		System.out.println("===========Using Comparable Method=============");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("============Using Comparator Method============");
		ComparatorFamily gk=new ComparatorFamily();
		Collections.sort(list,gk);
		System.out.println(list);

	}

}
