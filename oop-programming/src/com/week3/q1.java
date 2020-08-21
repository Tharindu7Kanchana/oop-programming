package com.week3;

public class q1 {
	public static void main(String[] args) {
		int[] array= {23, 6, 47, 35, 2, 14};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum/array.length);
	}

}