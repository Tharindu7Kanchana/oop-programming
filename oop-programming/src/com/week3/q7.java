package com.week3;

public class q7 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 5, 6, 6, 2};
		int[] duplicates = new int[array.length/2];
		int k=0;
		for(int i:array) {
			int count=0;
			for(int j:array) {
				if(i==j) {
					count++;
				}
			}
			if(count>=2 && !search(duplicates,i)) {
				duplicates[k]=i;
				k++;
			}
		}
		for(int i:duplicates) {
			if(k==0)
				break;
			System.out.print(i+"\t");
			k--;
		}
			
	}

	private static boolean search(int[] array, int i) {
		for(int k:array) { 
			if(k==i)
				return true;
		}
		return false;
	}
}