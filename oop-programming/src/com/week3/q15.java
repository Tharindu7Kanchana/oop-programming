package com.week3;

public class q15 {
	public static void main(String[] args) {
		System.out.println(get_mon(3) + " " + get_mon(7));
	}
	private static String get_mon(int m) {
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		return months[m-1];
	}
}
