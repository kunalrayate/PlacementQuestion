package com.String;

import java.util.Arrays;

public class Anagram {
	public static boolean abc(String str1, String str2) {
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String str1 = "lisent";
		String str2 = "silent";

		if (abc(str1, str2)) {
			System.out.println(str1 + " And " + str2 + " Are Anagrams.");
		} else {
			System.out.println(str1 + " And " + str2 + " Are Not Anagrams.");
		}
	}
}
