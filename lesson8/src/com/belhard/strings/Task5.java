package com.belhard.strings;

//Remove all extra spaces in the line

public class Task5 {

	public static void main(String[] args) {
		String str5 = "And     sorry I could not     travel both.     And be one traveler, long     I stood";

		while (str5.contains("  ")) {
			String replace = str5.replace("  ", " ");
			str5 = replace;
		}
		System.out.println(str5);
	}
}
