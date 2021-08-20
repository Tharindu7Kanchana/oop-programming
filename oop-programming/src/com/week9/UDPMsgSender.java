package com.week9;

import java.net.*;
import java.io.*;

public class UDPMsgSender {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			String str = "Message from Udp sender";
			InetAddress ia = Inet4Address.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),ia,3000);
			System.out.println("Udep sender");
			ds.send(dp);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
