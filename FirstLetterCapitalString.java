package com.technoelevate.javabasics.exceptionhandling;

public class FirstLetterCapitalString {
	public static void main(String[] args) {
		String str = "i am vijay sarjerao chavan";
		String words[] = str.split("\\s");
		String cStr = "";
		for (String word : words) {
			String fLetter = word.substring(0, 1);
			String rLetters = word.substring(1);
			cStr += fLetter.toUpperCase() + rLetters + " ";
		}
		System.out.println(cStr);
	}

}
