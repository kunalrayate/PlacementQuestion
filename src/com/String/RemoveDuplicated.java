package com.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicated {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = Sc.next();
		String str1 = String(str);
		System.out.println(str1);
	}

	private static String String(String str) {
		// TODO Auto-generated method stub
		Set<Character> s = new HashSet<>();
		StringBuilder br = new StringBuilder();
		for (Character character : str.toCharArray()) {
			if (!s.contains(character)) {
				br.append(character);
				s.add(character);
			}
		}
		return br.toString();
	}

}
