package com.belhard.strings;

//find the number of numbers

public class Task4 {

	public static void main(String[] args) {
		String str4 = "Scroll 1 time down to see the first 10000 digits of Pi at the bottom of this page, or grab even more using the links below";
		int count = 0;
		boolean number = false;
		for (int i = 0; i < str4.length(); i++) {
			if (Character.isDigit(str4.charAt(i))) {
				number = true;
			}
			if (!Character.isDigit(str4.charAt(i)) && number) {
				count++;
				number = false;
			}
		}
		if (number) {
			count++;
		}
		System.out.printf("Original text:%n\"%s\"%n", str4);
		System.out.println("\nNumber of numbers: " + count);
	}
}
