package com.week2;
import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int salary = sc.nextInt();
		System.out.println("Enter the Service");
		int service = sc.nextInt();
		if(service>=5)
			System.out.println("Net bonus amount is " + salary*0.05);
		else
			System.out.println("Not eligible for recieving the bonus");
	}
}
