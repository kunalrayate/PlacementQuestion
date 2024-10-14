package com.Array;

import java.util.Arrays;

public class SecondMinimumElement {
	public static void main(String[] args) {
		int[] a = { 34,56,89,76,10 };

		if (a.length < 2) {
			System.out.println("Its not a smallest element");
		} else {
			Arrays.sort(a);
			System.out.println("Second element : " + a[1]);

		}
	}

}
