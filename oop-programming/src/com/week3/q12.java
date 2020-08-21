package com.week3;

import java.util.Scanner;

public class q12 {
	public static void main(String[] args) {
		int[] array=new int[12];
		int flag=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		for(int k:array) {
			if(k==6) {
				System.out.println("Found");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			System.out.println("Not Found");
	}
}
