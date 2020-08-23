package com.week4.q1;

import java.util.Scanner;

public class testPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and address");
		String name=sc.nextLine();
		String address=sc.nextLine();
		student st = new student(name,address);
		System.out.println("Enter courses with relevant grade");
		for(int i=0;i<3;i++) {
			st.addCourseGrade(sc.next(), sc.nextInt());
		}
		System.out.println(st.toString());
		st.printGrades();
		System.out.println('\n'+st.getAverageGrade());
	}
}
