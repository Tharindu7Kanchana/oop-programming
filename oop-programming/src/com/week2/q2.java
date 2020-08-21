package com.week2;
import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		char c = input.charAt(0);
		if(input.length()>1)
			System.out.println("Input is not a Character");
		else if(!((c>='a' && c<='z') || (c>='A' && c<='Z')))
			System.out.println("Input is not in Alphabet");
		else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			System.err.println("Input is a Vowel");
		else
			System.out.println("Input is a Consonent");
	}

}
