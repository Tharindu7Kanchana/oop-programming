package com.week7;
import java.sql.*;

public class q2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "kavisql78");
				Statement st = con.createStatement();
				st.execute("use OOP");
				String sql = "Insert Into REGISTRATION VALUES(1066,\"Kavishka\",\"Tharindu\",22)";
				st.execute(sql);
				ResultSet rs  = st.executeQuery("Select * from REGISTRATION");
				while(rs.next()) {
					System.out.println(rs.getInt(0) + " " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
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