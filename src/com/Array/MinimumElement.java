package com.Array;

public class MinimumElement {
	public static void main(String[] args) {
		int a[] = { 35, 60, 25, 92, 56 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Element is : " + min);
	}
}
