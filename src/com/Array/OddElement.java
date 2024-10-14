package com.Array;

public class OddElement {
	public static void main(String[] args) {
		int a[] = { 23, 76, 89, 56, 72 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("Odd Element is : " + a[i]);
			}
		}
	}
}
