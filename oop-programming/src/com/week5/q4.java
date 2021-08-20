package com.week5;
import java.util.Scanner;

public class q4 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			try
			{
				System.out.println("Please enter number:");
				String str=in.next();
				int a=Integer.parseInt(str);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println(e + "\n");
				System.out.println(e.getMessage() + "\n");
				e.printStackTrace();
			}
		}
	}
}