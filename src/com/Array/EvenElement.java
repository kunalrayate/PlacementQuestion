package com.Array;

public class EvenElement {
	public static void main(String[] args) {
		int a[] = { 23, 34, 98, 64, 70 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even Element is : " + a[i]);
			}
		}
	}
}