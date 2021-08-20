package com.week5;

public class q5 {
	public static void main(String[] args) {
		int sum = 0;
		try {
			for(String i:args) {
				sum += Integer.parseInt(i);
				System.out.println(i);
			}
			System.out.println("\nSum : " + sum);
		}
		catch(NumberFormatException e) {
			System.out.println( e + "\n");
		}
	}
}
