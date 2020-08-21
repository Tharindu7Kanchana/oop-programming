package com.week2;
import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter gender (M or F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("Enter marital status (Y or N) : ");
		char martial = sc.next().charAt(0);
		sc.close();
		if(gender=='F')
			System.out.println("Work only in urban areas");
		else if(gender=='M' && age<=40 && age>=20)
			System.out.println("May work in anywhere");
		else if(gender=='M' && age<=60 && age>40)
			System.out.println("Work only in urban areas");
		else
			System.out.println("ERROR");
	}
}