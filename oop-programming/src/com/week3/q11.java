package com.week3;

public class q11 {
	public static void main(String[] args) {
		int [][] array ={
				{1,3,4},
				{6,9,2},
				{-6,8,0},
				{5,3,-2}
				};
		for(int[] k:array) {
			for(int l:k) {
				System.out.print(l+"\t");
			}
			System.out.println();
		}
	}
}
