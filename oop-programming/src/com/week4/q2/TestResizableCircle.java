package com.week4.q2;

public class TestResizableCircle {

	public static void main(String[] args) {
		
		ResizableCircle c = new ResizableCircle(14);
		System.out.println("Perimeter : " + c.getPerimeter() + "Radius : " + c.getArea());
		c.resize(50);
		System.out.println("Perimeter : " + c.getPerimeter() + "Radius : " + c.getArea());
	}
}
