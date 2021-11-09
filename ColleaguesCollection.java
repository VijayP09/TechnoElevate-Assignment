package com.technoelevate.hashsetsortoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColleaguesCollection {

	public static void main(String[] args) {
		List<Colleagues> list=new ArrayList<Colleagues>();
		list.add(new Colleagues("Sandesha", 22, "Best Friend"));
		list.add(new Colleagues("Manisha", 20, "Bestie Friend"));
		list.add(new Colleagues("Ganesh", 23, "Just Friend"));
		list.add(new Colleagues("Saurabh", 25, "Friend"));
		list.add(new Colleagues("Gaurav", 21, "Friend"));
		list.add(new Colleagues("Swapnil", 30, "Not a Friend"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		System.out.println("============Using Comparator Method==============");
		ComparatorColleagues sp=new ComparatorColleagues();
		Collections.sort(list,sp);
		System.out.println(list);

	}

}
