package com.week4.q3;

public class TestMovablePoint {

	public static void main(String[] args) {
		MovablePoint p = new MovablePoint(20, 10);
		System.out.println("X : " + p.x + " Y : " + p.y);
		p.moveUp();
		p.moveLeft();
		System.out.println("X : " + p.x + " Y : " + p.y);
		p.moveDown();
		p.moveRight();
		System.out.println("X : " + p.x + " Y : " + p.y);
	}
}
