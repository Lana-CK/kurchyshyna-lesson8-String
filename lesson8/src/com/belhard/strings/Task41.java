package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//find the number of numbers

public class Task41 {

	public static void main(String[] args) {
		String str41 = "Scroll 1 time down to see the first 10000.00 digits of Pi at the bottom of this page, or grab even more using the links below";
		int result = countNumbers(str41);
		System.out.println("Number of numbers in the string:" + result);
	}

	private static int countNumbers(String str41) {
		Pattern pattern = Pattern.compile("\\d+[.,]?\\d*");
		Matcher matcher = pattern.matcher(str41);
		int count = 0;
		while (matcher.find()) {
			int st = matcher.start();
			int end = matcher.end();
			str41.substring(st, end);
			count++;
		}
		return count;
	}
}