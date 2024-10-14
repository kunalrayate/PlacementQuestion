package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();

			if (num % 2 == 0) {
				System.out.println("Given Number is Prime");
			} else {
				System.out.println("Given Number  is Not Prime");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer Digit");
		}
	}
}
