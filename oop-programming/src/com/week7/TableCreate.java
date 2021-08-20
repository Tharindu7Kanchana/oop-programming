package com.week7;
import java.sql.*;

public class TableCreate {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgt","root","kavisql78");
				String sql = "CREATE TABLE student_info(Index_No varchar(6) PRIMARY KEY,Name varchar(20),Age int,Home_Town varchar(35))";
				Statement st = con.createStatement();
				st.executeUpdate(sql);
				System.out.println("Table Creation Successful");
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
