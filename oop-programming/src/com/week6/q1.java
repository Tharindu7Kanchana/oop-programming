package com.week6;

public class q1 {
	public static void main(String[] args) {
		ThreadExtended te = new ThreadExtended();
		te.start();
		
		ThreadRunnable tr = new ThreadRunnable();
		tr.run();
	}
}
