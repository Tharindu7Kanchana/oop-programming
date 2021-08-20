package com.week5;

public class q1 {
	public static void main(String[] args) {
		
		// 1
		
		int a=500;
		int c = 0;
		try {
			c=a/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Answer :"+c);
		}
		
		// 2
		
		int[] amounts={23,12,34,56,43};
		int sum=0;
		
		System.out.println(amounts);
		try {
			for(int i=0;i<10;i++)
			{
			sum+=amounts[i];
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Answer :"+ sum);
		}
		
		// 3
		
		String ptr=null;
		try {
			if(ptr.equals("hello"))
			{
			System.out.println("Same");
			}
			else
			{
			System.out.println("Not same");
			}
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
