package com.technoelevate.javabasic.assignment2;

public class VotingRules {

	int age =18;
	
	public void votingRules(int age) throws notEligible {
		if(age<this.age) {
			throw new notEligible("Age Is Less Than 18 Not Allowed");
		}else {
			System.out.println("Ready To Voting");
		}
	}
}
