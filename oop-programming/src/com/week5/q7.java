package com.week5;

public class q7 {
	public static void main(String[] args) {
		try {
			try {
				int a = Integer.parseInt("a");
				int b=a/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Caught inside");
				e.printStackTrace();
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Caught outside");
			e.printStackTrace();
		}
	}
}
