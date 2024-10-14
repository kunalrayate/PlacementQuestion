package com.String;

import java.util.Scanner;

public class FIndConsonants {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str1 = Sc.next();
		String str2 = str1.toLowerCase();
		char c[] = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.println(str1.charAt(i));
			}
		}

	}

}
