package com.week3;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt(),col=sc.nextInt();
		sc.close();
		int[][] matrix1=new int[row][col];
		int[][] matrix2=new int[row][col];
		int[][] sum=new int[row][col];
		for(int i=0;i<row;i++) {
			int l=1;
			for(int j=0;j<col;j++) {
				matrix1[i][j]=l;
				matrix2[i][j]=l+2;
				l++;
			}
		}
		System.out.println("\nFirst matrix\n");
		for(int[] k: matrix1) {
			for(int l: k) {
				System.out.print(l+"\t");
			}
			System.out.println("");
		}
		System.out.println("\nSecond martrix\n");
		for(int[] k: matrix2) {
			for(int l: k) {
				System.out.print(l+"\t");
			}
			System.out.println("");
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("\nSum of the above two\n");
		for(int[] k: sum) {
			for(int l: k) {
				System.out.print(l+"\t");
			}
			System.out.println("");
		}
	}
}
