package com.week7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				System.out.println("Database connection established");
				Statement st = con.createStatement();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the city to search");
				String city = sc.nextLine();
				searchStudentByCity(st,city);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void searchStudentByCity(Statement st, String city) throws SQLException {
		ResultSet rs = st.executeQuery("SELECT * FROM student_info WHERE Home_Town =  \'" + city + "\'");
		if(rs.getWarnings() == null)
			System.out.println("Empty Set");
		while(rs.next()) {
			System.out.println("* " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
		}
	}
}
