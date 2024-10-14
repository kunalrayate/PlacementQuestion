package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fictorial {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial is : " + fact);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

}
