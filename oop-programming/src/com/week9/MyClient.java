package com.week9;

import java.net.*;
import java.io.*;

public class MyClient {
	public static void main(String[] args) {
		try {
			System.out.println("This is Myclient");
			Socket client = new Socket("localhost",2222);
			DataInputStream is = new DataInputStream(client.getInputStream());
			DataOutputStream os = new DataOutputStream(client.getOutputStream());
			
			String ss = is.readUTF();
			System.out.println(ss);
			
			os.writeUTF("This message from client");
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
