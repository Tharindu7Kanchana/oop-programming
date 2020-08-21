package com.week3;

public class q6 {
	public static void main(String[] args) {
		int[] array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254,
1472, 2365, 1456, 2165, 1457, 2456 };
		int[] rev_array = new int[array.length];
		for(int j=array.length-1;j>=0;j--) {
			rev_array[array.length-j-1]=array[j];
		}
		for(int k:rev_array) {
			System.out.print(k+"\t");
		}
	}
}
