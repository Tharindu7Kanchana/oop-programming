package com.week5;
import java.io.*;

public class q6 {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("ExceptionCheck", "r");
			byte[] arr = new byte[1000];
			raf.readFully(arr,0,33);
			raf.close();
			System.out.println(new String(arr));
		}
		catch(FileNotFoundException e) {
			System.err.println("File not Found");
			e.printStackTrace();
		}
		catch(IOException e){
			System.err.println("IO Error");
			e.printStackTrace();
		}
		finally {
		}
	}
}
