package com.week9;

import java.net.*;
import java.io.*;

public class MyServer {
	public static void main(String[] args) {
		ServerSocket s;
		try {
			s = new ServerSocket(2222);
			Socket s1 = s.accept();

			System.out.println("MyServer Starting");
			DataOutputStream os = new DataOutputStream(s1.getOutputStream());
			DataInputStream is = new DataInputStream(s1.getInputStream());
			os.writeUTF("Hi, Server run at 2222");
			String ss = is.readUTF();
			System.out.println(ss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
