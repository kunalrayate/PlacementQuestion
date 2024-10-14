package com.Array;

public class MaximumElement {
	public static void main(String[] args) {
		int a[] = { 10, 65, 98, 49 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println("Maximum Element is : " + max);
	}
}