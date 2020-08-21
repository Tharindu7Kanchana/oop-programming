package com.week3;

public class q10 {
	public static void main(String[] args) {
		int[] a = {12, 34, 45,12};
		int[] b = {34, 23, 61, 10};
		int[] result = new int[4];
		for(int i=0;i<a.length;i++) {
			result[i] = a[i] + b[i];
		}
		for(int k: result)
			System.out.print(k+"\t");
	}
}
