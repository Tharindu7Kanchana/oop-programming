package com.week5;

import java.io.IOException;
import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		try {
			System.out.println(getUserInputs());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static String getUserInputs() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the port NUMber :");
		int p = sc.nextInt();
		return getPort(p);
	}
	
	public static String getPort(int p) throws IOException{
		switch(p) {
		case 20 :
			return "FTP";
		case 22 :
			return "SSH";
		case 25 :
			return "SMTP";
		case 53 :
			return "DNS";
		case 80 :
			return "HTTP";
		case 161 :
			return "SNMP";
		default:
			throw new IOException("Invalid port");
				
		}
	}
}
