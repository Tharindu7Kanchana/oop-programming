package com.week7;
import java.sql.*;

public class q4_2 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				Statement st = con.createStatement();
				con.setAutoCommit(false);
				
				st.addBatch("INSERT INTO Student_info VALUES("
						+ "\"SC4444\","
						+ "\"Lasith\","
						+ 22
						+ ",\"Pandura\""
						+ ")");
				st.addBatch("INSERT INTO Student_info VALUES("
						+ "\"SC1111\","
						+ "\"Madushan\","
						+ 28
						+ ",\"Kaluthara\""
						+ ")");
				st.executeBatch();
				con.commit();
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
