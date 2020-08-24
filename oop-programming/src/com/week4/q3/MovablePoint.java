package com.week4.q3;

public class MovablePoint implements Movable {

	int x;
	int y;
	public MovablePoint(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void moveUp() {
		this.y += 1;
	}
	
	@Override
	public void moveDown() {
		this.y -= 1;
	}
	
	@Override
	public void moveLeft() {
		this.x -= 1;
	}
	
	@Override
	public void moveRight() {
		this.x += 1;
	}
}
