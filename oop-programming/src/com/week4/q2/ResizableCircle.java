package com.week4.q2;

public class ResizableCircle extends Circle implements Resizable{

	ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		
		super.radius = (super.radius*percent)/100;
	}
	
}
