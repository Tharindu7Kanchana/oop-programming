package com.week7;
import java.sql.*;

public class test {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM student_info");
				while(rs.next()) {
					System.out.println(rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getInt(3) + ' ' + rs.getString(4));
				}
		
				System.out.println();
				
				st.execute("DELETE FROM student_info WHERE Index_No in (\"SC1111\",\"SC4444\")");
				
				rs = st.executeQuery("SELECT * FROM student_info");
				while(rs.next()) {
					System.out.println(rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getInt(3) + ' ' + rs.getString(4));
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
