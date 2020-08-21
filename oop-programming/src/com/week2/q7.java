package com.week2;
import java.util.Scanner;
public class q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's class year : ");
		int year = sc.nextInt();
		sc.close();
		switch(year) {
		case 1:
			System.out.println("Freshman");
			break;
		case 2:
			System.out.println("Sophomore");
			break;
		case 3:
			System.out.println("Junior");
			break;
		case 4:
			System.out.println("Senior");
			break;
		}
	}

}