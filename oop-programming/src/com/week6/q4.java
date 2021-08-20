package com.week6;

class q4_thread extends Thread{
	private String name;
	public q4_thread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(i + " " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class q4 {
	public static void main(String[] args) {
		q4_thread thread1 = new q4_thread("thread1");
		q4_thread thread2 = new q4_thread("thread2");
		
		thread1.run();
		thread2.run();
	}
}
