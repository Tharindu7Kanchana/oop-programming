package com.week5;
import java.io.*;
public class q2 {
	public static void main(String[] args) {
		String line;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("ExceptionCheck"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			while((line=br.readLine())!=null)
			{
			System.out.println(line);
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
