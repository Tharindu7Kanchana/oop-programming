package com.week7;
import java.sql.*;

public class retrieveData {
	public static void main(String[] args) {
		Connection con;
		con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				int i = 1;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM student_info");
				while(rs.next()) {
					System.out.println( i++ + ") " + rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getInt(3) + ' ' + rs.getString(4));
				}
		
				System.out.println();
				i = 1;
				rs = st.executeQuery("SELECT * FROM student_info ORDER BY Name desc");
				while(rs.next()) {
					System.out.println(i++ +") " + rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getInt(3) + ' ' + rs.getString(4));
				}
				
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