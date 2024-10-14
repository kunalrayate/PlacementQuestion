package com.Series;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HollowSeries {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value for Row");
			int row = Sc.nextInt();
			System.out.println("Enter Value for Column");
			int column = Sc.nextInt();
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= column; j++) {
					if (i == 1 || j == 1 || i == row || j == column) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");

		}

	}
}
