package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//replace all “black” to “white” (must be case-insensitive) => in my case "I" to "we"
//replace(char, char) => .replace('.', ';');
//replace(CharSequence, CharSequence) => .replace( "I", "we");
//replaceFirst(String regex, String replacement) => .replace( "I", "we"); - 1st word that`ll find in a text
//replaceAll(String regex, String replacement); - will replace all words in the text

public class Task2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s[a-zA-Z]{1}\\s");
		Matcher matcher = pattern.matcher("And sorry I could not travel both. And be one traveler, long I stood");
		String str2 = matcher.replaceAll(" we ");

		/*
		 * String str2 =
		 * "And sorry I could not travel both. And be one traveler, long I stood" //
		 * .replaceAll("\\s[a-zA-Z]{1}\\s", " we ");
		 */
//		String str2 = "And sorry I could not travel both. And be one traveler, long I stood".replace("I", "we");
		System.out.println(str2);
	}
}
