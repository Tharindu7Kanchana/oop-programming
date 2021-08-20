package com.week9;

import java.net.*;
import java.io.*;

public class UDPMsgReciever {
	public static void main(String[] args) {
		
		try {
			DatagramSocket ds = new DatagramSocket(3000);
			byte[] buf = new byte[4024];
			System.out.println("udep receiver");
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			
			String s = new String(dp.getData(),0,dp.getLength()
					);
			System.out.println(s);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
