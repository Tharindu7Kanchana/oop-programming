package com.week2;

public class q5 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int k=10;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
					System.out.print(" "+i);
			}	
			System.out.print("\n");
		}
	}

}
                  