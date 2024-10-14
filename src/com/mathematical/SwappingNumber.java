package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwappingNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First  Values");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second  Values");
			int num2 = Sc.nextInt();
			int temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("After Swapping First  Values is : " + num1);
			System.out.println("After Swapping Second  Values is : " + num2);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer Value");
		}
	}
}
