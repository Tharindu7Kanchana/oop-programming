package com.week3;

public class q14 {
	public static void main(String[] args) {
		System.out.println(area(7)+" "+area(5));
	}
	public static double area(int radius) {
		return Math.round(Math.PI*radius*radius);
	}
}