package com.belhard.strings;

//String Array camelCase => to snake_case

public class Task1 {

	public static String camelToSnake(String str) {
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		str = str.replaceAll(regex, replacement);
		return str.toLowerCase();
	}

	public static void main(String args[]) {
		String str = "TwoRoadsDivergedInAYellowWood";
		System.out.print(camelToSnake(str));
	}
}
