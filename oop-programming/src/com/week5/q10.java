package com.week5;

class MyNameException extends Exception{
	private String name;
	public MyNameException(String name) {
		super("Invalid name: " + name);
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class q10 {
	public static void main(String[] args) {
		try {
			throw new MyNameException("Tharindu");
		} catch (MyNameException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
