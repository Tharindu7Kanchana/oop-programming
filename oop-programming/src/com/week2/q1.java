package com.week2;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float input = sc.nextFloat();
		if(input==0)
			System.out.println("Zero");
		else if(input>0)
			System.out.println("Positive");
		else if(input<0)
			System.out.println("Negative");
		sc.close();
	}

}
