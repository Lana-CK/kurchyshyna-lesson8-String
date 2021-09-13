package com.belhard.strings;

//find the number of digits

public class Task3 {

	public static void main(String[] args) {
		String str3 = "Scroll 1 time down to see the first 10_000 digits of Pi at the bottom of this page, or grab even more using the links below";
		long count = str3.codePoints().filter(Character::isDigit).count();
		System.out.println(count);

//		int count = str3.replace("[^0-9]", "").length(); количество символов в строке
	}

}
