package com.week5;

class AttendanceException extends Exception{
	public AttendanceException(double attendance_percentage) {
		super("Not an enough attendance_percentage: " + Math.round(attendance_percentage));
	}
}

class AttendanceVerifier{
	double attendance_percentage;
	public void AttendanceCalcultor(double lecturesAtteneded, double totalLectures) throws AttendanceException{
		this.attendance_percentage = (lecturesAtteneded/totalLectures)*100;
		if (this.attendance_percentage<80) {
			throw new AttendanceException(this.attendance_percentage);
		}
	}
	public double getAttendance_percentage() {
		return this.attendance_percentage;
	}
}

public class q11 {
	public static void main(String[] args) {
		AttendanceVerifier av = new AttendanceVerifier();
		int[] attended_lectures={25,28,15,27,20};
		for(int i : attended_lectures) {
			try {
				av.AttendanceCalcultor(i, 30);
				System.out.println(Math.round(av.attendance_percentage));
			}
			catch(AttendanceException e){
				System.out.println(e.getMessage());
			}
		}
	}
}