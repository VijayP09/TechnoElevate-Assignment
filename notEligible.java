package com.technoelevate.javabasic.assignment2;

public class notEligible extends Exception {

	String msg;

	public notEligible(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
}
