package com.week6;

public class q2 {
	public static void main(String[] args) {
		NamedThread nt = new NamedThread("Thread 1");
		NamedThread nt1 = new NamedThread("Thread 2");
		nt.start();
		nt1.start();
	}
}
