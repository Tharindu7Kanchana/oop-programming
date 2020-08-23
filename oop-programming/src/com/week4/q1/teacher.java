package com.week4.q1;


public class teacher extends person{
	private int numCourses = 0;
	private String[] courses = {};
	
	teacher(String name, String address) {
		super(name, address);	
	}
	public boolean addCourse(String course) {
		for(String k:this.courses) {
			if(k==course)
				return false;
		}
		this.courses[numCourses] = course;
		numCourses+=1;
		return true;
	}
	public boolean removeCourse(String course) {
		for(String k:this.courses) {
			if(k==course)
				return true;
		}
		this.courses[courses.length] = null;
		this.numCourses-=1;
		return false;
	}
	public String toString() {
		return "Teacher: "+name+'('+address+')';
	}
}
