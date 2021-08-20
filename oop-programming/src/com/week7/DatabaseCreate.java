package com.week7;
import java.sql.*;

public class DatabaseCreate {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","kavisql78");
				System.out.println("Connection Successful");
				Statement st = con.createStatement();
				st.executeUpdate("CREATE DATABASE student_mgt");
				System.out.println("Database Created");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
