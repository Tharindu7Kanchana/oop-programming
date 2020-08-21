package com.week3;

public class q13 {
	public static void main(String[] args) {
		System.out.println(odd_even(34) + " " + odd_even(33));
	}
	private static String odd_even(int x) {
		if(x%2==0)
			return "Even";
		else
			return "Odd";
	}
}