package com.week6;

public class NamedThread extends Thread{
	private String name;
	public NamedThread(String name) {
		super(name);
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(" "+ i + " " + name);
		}
	}
}