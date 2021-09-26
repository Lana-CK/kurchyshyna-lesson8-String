package com.belhard.strings;

//replace all “black” to “white” (must be case-insensitive) => in my case "I" to "we":
//replace(char, char) => .replace('.', ';');
//replace(CharSequence, CharSequence) => .replace( "I", "we");
//replaceFirst(String regex, String replacement) => .replace( "I", "we"); - 1st word that`ll find in a text
//replaceAll(String regex, String replacement); - will replace all words in the text

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {
		String str2 = "And sorry I could not travel both. And be one traveler, long I stood";
		System.out.printf("Original text:%n\\\"%s\\\"%n", str2);
		System.out.println("\nSample solution:");

		Pattern pattern = Pattern.compile("\\s[a-zA-Z]{1}\\s");
		Matcher matcher = pattern.matcher(str2);
		String string = matcher.replaceAll(" we ");
		System.out.println(string);

		String str21 = str2.replaceAll("\\s[a-zA-Z]{1}\\s", " we ");
		System.out.println(str21);

		String str22 = "And sorry I could not travel both. And be one traveler, long I stood".replace("I", "we");
		System.out.println(str22);
	}
}
