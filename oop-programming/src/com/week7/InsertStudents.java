package com.week7;
import java.sql.*;

public class InsertStudents {
	private static String insertSql(String index,String name, int age, String town) {
		return "INSERT INTO student_info VALUES(" + index + "," + name + "," + age + "," + town + ")";
	}
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				System.out.println("Connction Successful");
				Statement st = con.createStatement();
				st.addBatch(insertSql("\"SC7745\"", "\"John\"", 23, "\"Kottawa\""));
				st.addBatch(insertSql("\"SC5678\"", "\"Michael\"", 28, "\"Colombo\""));
				st.addBatch(insertSql("\"SC8674\"", "\"Ann\"", 33, "\"Colombo\""));
				st.addBatch(insertSql("\"SC9873\"", "\"Suresh\"", 21, "\"Kelaniya\""));
				st.addBatch(insertSql("\"SC7634\"", "\"Kamal\"", 23, "\"Matara\""));
				st.addBatch(insertSql("\"SC3456\"", "\"Lakmal\"", 30, "\"Colombo\""));
				
				st.executeBatch();
				System.out.println("Insert Complete");
			}
			catch(BatchUpdateException e) {
				e.printStackTrace();
			}
			
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
