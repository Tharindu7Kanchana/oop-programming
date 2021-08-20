package com.week4.q1;


public class teacher extends person{
	private int numCourses = 0;
	private String[] courses = new String[10];
	
	teacher(String name, String address) {
		super(name, address);	
	}
	public boolean addCourse(String course) {
		for(String k:this.courses) {
			if(k==null)
				break;
			if(k.equals(course))
				return false;
		}
		
		this.courses[numCourses] = course;
		this.numCourses+=1;
		return true;
	}
	public boolean removeCourse(String course) {
		int i=0;
		for(String k:this.getCourses()) {
			if(k==null)
				break;
			if(k.equals(course))
			{
				this.getCourses()[i] = null;
				this.numCourses-=1;
				return true;
			}
			i++;	
		}
		return false;
	}
	public String toString() {
		return "Teacher: "+name+'('+address+')';
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}
