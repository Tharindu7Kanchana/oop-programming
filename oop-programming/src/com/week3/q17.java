package com.week3;
import java.util.*;

public class q17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangles tr=new Triangles();
		System.out.println("Enter the number of rows to be printed: ");
		int numrows=sc.nextInt();
		tr.powerOf2Triangle(numrows);
	}
}
class Triangles{
	void powerOf2Triangle(int row) {
		row = row*2;
		for(int i=1;i<=row;i+=2) {
			
			for(int k=row;k>i;k--) {
				System.out.print("  ");
			}
			int j=0;
			for(j=0;j<=i-j;j+=1) {
				System.out.print("   "+ Math.round(Math.pow(2, j)));
			}
			if(i>2) {
					for(int l=j-2;l>=0;l-=1) {
						System.out.print("   "+ Math.round(Math.pow(2, l)));
				}
			}
			System.out.println();
		}
	}
}
