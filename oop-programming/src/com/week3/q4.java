package com.week3;

public class q4 {
	private static int index(int[] array,int x) {
		int index=0;
		for(int k:array) {
			if(k==x)
				break;
			index++;
		}
		return index;
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i=0;i<10;i++) {
			array[i]=i;
		}
		System.out.println(index(array,6) + "\t" + index(array,9) + "\t" + index(array,2));
	}
}
