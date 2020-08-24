package com.week4.q2;

public class Circle implements GeometricObject{
	
	protected double radius = 1.0;
	
	Circle(double radius){
		
		this.radius = radius;
	
	}
	
	@Override
	public double getPerimeter() {
	
		return Math.round(2*radius*Math.PI);
	
	}

	@Override
	public double getArea() {
		
		return Math.round(Math.PI*Math.pow(radius, 2));
	
	}
	
}
