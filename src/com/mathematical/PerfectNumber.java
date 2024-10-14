package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();
			int i = 1;
			int sum = 0;
			while (i < num) {
				if (num % i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == num) {
				System.out.println("Given Number is Perfect Number");
			} else {
				System.out.println("Given Number is Not Perfect Number");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer Value");

		}

	}
}
