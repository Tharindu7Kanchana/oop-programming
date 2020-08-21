package com.week3;

public class q5 {
	public static void main(String[] args) {
		int[] array = {23, 45, 12, 56, 22};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int k:array) {
			System.out.print(k+"\t");
		}
	}
}
