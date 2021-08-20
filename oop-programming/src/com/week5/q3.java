package com.week5;

class point{
	int x,y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class line{
	public static Object gradient(point p1,point p2) {
		try {
			return (p2.y-p1.y)/(p2.x-p1.x);
		}
		catch(ArithmeticException e) {
			return "Infinity";
		}
	}
}

public class q3 {
	public static void main(String[] args) {
		point p1 = new point(2,94);
		point p2 = new point(5,12);
		
		System.out.println(line.gradient(p1, p2).toString());
	}
}
