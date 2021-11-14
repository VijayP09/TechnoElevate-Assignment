package com.technoelevate.hashsetsortoperation;

import java.util.Comparator;

public class ComparatorColleagues implements Comparator<Colleagues> {
	@Override
	public int compare(Colleagues o1, Colleagues o2) {
		// TODO Auto-generated method stub
		return o2.relation.compareTo(o1.relation);
	}

}
