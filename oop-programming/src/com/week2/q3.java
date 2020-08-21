package com.week2;
import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
			int input = sc.nextInt();
			sum = sum + input;
		}
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + sum/5);
		sc.close();
	}

}
