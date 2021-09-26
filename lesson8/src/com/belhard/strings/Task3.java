package com.belhard.strings;

//find the number of digits

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {
		String str3 = "Scroll 1 time down to see the first 10_000 digits of Pi at the bottom of this page, or grab even more using the links below";
		long count1 = str3.codePoints().filter(Character::isDigit).count();
		System.out.printf("The string:%n\"%s\"%ncontains %d digits", str3, count1);

		Pattern pattern = Pattern.compile("[0-9]"); // ("(\\d+)") the same
		Matcher matcher = pattern.matcher(str3);
		int count2 = 0;
		while (matcher.find()) {
			int st = matcher.start();
			int end = matcher.end();
			str3.substring(st, end);
			count2++;
		}
		System.out.printf("%n%nThe string:%n\"%s\"%ncontains %d digits", str3, count2);

		int count3 = str3.replace("[^0-9]", " ").length(); // counting symbols, but it`s wrong?
		System.out.printf("%n%nThe string:%n\"%s\"%ncontains %d symbols", str3, count3);
	}
}
