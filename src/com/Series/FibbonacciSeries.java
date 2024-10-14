package com.Series;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibbonacciSeries {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num1 = Sc.nextInt();
			int num2 = 1;
			int num3 = 0;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num1);
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

}