package com.belhard.strings;

//after each "A" put "B"

public class Task7 {

	public static void main(String[] args) {
		String str7 = "And sorry I could not travel both. And be one traveler, long I stood";
		   StringBuilder str1 = new StringBuilder(str7);
		   StringBuilder str2 = new StringBuilder();
	        for (int i = 0; i < str1.length(); i++) {
	            str2.append(str1.charAt(i));
	            if (str1.charAt(i) == 'a') str2.append("b");    // charAt(int index) 
	            if (str1.charAt(i) == 'A') str2.append("B");
	        }
		System.out.println("String where bB goes after aA: \n"+ str2.toString());
	
//		String regex = "([Aa+])";
//		String replacement = "Bb";
//		str7 = str7.replaceAll(regex, replacement);
//		return str7;
//		
	        }
	}

		
	        
	    
