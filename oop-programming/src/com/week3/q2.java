package com.week3;

public class q2 {
	public static void main(String[] args) {
		int[] array= {23, 6, 47, 35, 2, 14};
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i-1])
				max=array[i-1];
		}
		System.out.println("The maximum value of the array : " + max);
		
		int min=array[0];
		for(int k:array) {
			if(min>k)
				min=k;
		}
		System.out.println("The minimum value of the array : " + min);
	}
}
