package com.week3;

public class q16 {
	public static void main(String[] args) {
		int[] array= {23, 45, 12, 56, 22};
		System.out.println(max_min(array));
	}
	private static int max_min(int[] array) {
		int min=array[0],max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		return max-min;
	}
}
