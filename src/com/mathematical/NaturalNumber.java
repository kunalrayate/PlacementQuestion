package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();
			int i = 1;
			int sum = 0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			System.out.println("Natural Value of " + " " + num + " is :  " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer Value");
		}
	}
}
