package com.week4.q1;


public class student extends person {
	private int numCourses = 0;
	private String[] courses = new String[10];
	private int[] grades = new int[10];
	student(String name, String address) {
		super(name, address);
	}
	public void addCourseGrade(String course,int grade) {
		this.courses[numCourses] = course;
		this.grades[numCourses] = grade;
		numCourses+=1;
	}
	public void printGrades() {
		for(int i=0;i<numCourses;i++) {
			System.out.println(courses[i]);
		}
	}
	public double getAverageGrade() {
		double sum = 0;
		for(int k:grades) {
			sum+=k;
		}
		return Math.round(sum/numCourses);
	}
	public String toString() {
		return "Student: "+name+'('+address+')';
	}
}
