package com.String;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = Sc.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
