package com.mathematical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Value");
			int num = Sc.nextInt();
			int temp = num;
			int sum = 0;
			int cnt = 0;
			while (temp > 0) {
				cnt++;
				temp /= 10;
			}
			temp = num;
			while (temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, cnt);
				temp /= 10;
			}
			if (num == sum) {
				System.out.println("Given Number is Armstrong");
			} else {
				System.out.println("Given Number is Not Armstrong");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integer  Value");
		}

	}

}
