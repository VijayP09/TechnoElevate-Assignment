package com.technoelevate.basicjava.Encapsulation;

public class MainMethodEncapsulation {

	public static void main(String[] args) {
		TechnoElevateCompany sp=new TechnoElevateCompany();
		sp.setName("Ganesh Havile");
		sp.setEmpid("ABC0799");
		sp.setTime("10:30am to 7pm");
		sp.setTopiclearnt("Core Java,Methods,Variables,Datatypes,OOPs");
		System.out.println("Employee Name: "+sp.getName());
		System.out.println("Employee Id: "+sp.getEmpid());
		System.out.println("Employee Timing: "+sp.getTime());
		System.out.println("Employee Topiclearnt: "+sp.getTopiclearnt());

	}

}
