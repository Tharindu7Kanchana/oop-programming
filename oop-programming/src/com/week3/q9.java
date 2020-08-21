package com.week3;

public class q9 {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[10];
		for(int i=0;i<=9;i++) {
			array1[i]=i+1;
			array2[i]=i+2;
			array3[i]=i+1;
		}
		for(int k:array1) {
			System.out.print(k+"\t");
		}
		System.out.println();
		for(int k:array2) {
			System.out.print(k+"\t");
		}
		System.out.println();
		for(int k:array3) {
			System.out.print(k+"\t");
		}
		System.out.println("\n");
		System.out.println(equels(array1,array2)+"\t"+equels(array1,array3));
		
	}
	private static boolean equels(int[] array,int[] array1) {
		for(int i=0;i<array.length;i++) {
			if(array[i]!=array1[i]) {
				return false;
			}
		}
		return true;
	}
}
