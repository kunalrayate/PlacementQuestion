package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();
			int temp = num;
			int rev = 0;
			while (num > 0) {
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num / 10;
			}
			if (temp == rev) {
				System.out.println("Given Number is Palindrome");
			} else {
				System.out.println("Given Number is Not Palindrome");

			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer  Value");
		}
	}
}
