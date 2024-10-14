package com.String;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = Sc.next();
		String str1 = str.toLowerCase();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		if (rev.equals(str1)) {
			System.out.println("Given Name is Palindrome");
		} else {
			System.out.println("Given Name is Not Palindrome");
		}
	}

}
