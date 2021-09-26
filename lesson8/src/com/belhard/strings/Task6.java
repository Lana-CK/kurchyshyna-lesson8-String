package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//The largest number of spaces in the text

public class Task6 {

	public static void main(String[] args) {
		String str6 = "And     sorry I could not     travel both.     And be one traveler, long         I stood";
		int result = countTheLargestNumberOfSpaces(str6);
		System.out.println("The largest number of spaces is: " + result);
	}

	private static int countTheLargestNumberOfSpaces(String str6) {
		int length = str6.replaceAll("[^ ]", "").length();  //count summ of spaces
		return length++;

//		int min = 0;
//		int max = 0;
//		for (char sp : str6.toCharArray()) {
//			if (sp == ' ') {
//			if (max >= min);
//			max++;
//			} else
//			min = 0;
//		}
	}
}
