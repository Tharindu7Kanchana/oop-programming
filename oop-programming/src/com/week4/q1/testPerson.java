package com.week4.q1;

import java.util.Scanner;

public class testPerson {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name and address");
		String name=sc.nextLine();
		String address=sc.nextLine();
		
		student st = new student(name,address);
		teacher te = new teacher(name,address);
		
		System.out.println("Enter courses with relevant grade");
		for(int i=0;i<3;i++) {
			String course=sc.next();
			int grade=sc.nextInt();
			st.addCourseGrade(course, grade);
			te.addCourse(course);
		}
		sc.close();
		
		System.out.println(st.toString());
		st.printGrades();
		System.out.println('\n'+st.getAverageGrade());
		
		
		for(String k:te.getCourses()) {
			if(k!=null)
				System.out.println(k);
		}
		System.out.println(te.toString());
		System.out.println(te.removeCourse("eng"));
		for(String k:te.getCourses()) {
			if(k!=null)
				System.out.println(k);
		}
		
	}
}
