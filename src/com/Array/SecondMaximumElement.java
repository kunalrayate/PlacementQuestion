package com.Array;

public class SecondMaximumElement {
	public static void main(String[] args) {
		int a[] = { 10, 12, 65, 87, 25 };
		int max = 0;
		for (int i = 0; i < a.length - 2; i++) {
			if (max < a[i]) {

			}
			max = a[i];
		}
		System.out.println("Second Maximum Element is : " + max);
	}
}