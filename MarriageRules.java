package com.technoelevate.javabasic.assignment2;

public class MarriageRules {

	int h=21;
	int w=18;
	
	public void marriageRules(int h, int w) throws marrisgeCancle {
		if(h<this.h||w<this.w) {
			throw new marrisgeCancle("Not Eligible For Marriage");
		}else {
			System.out.println("Eligible For Marriage");
		}
	}
}
