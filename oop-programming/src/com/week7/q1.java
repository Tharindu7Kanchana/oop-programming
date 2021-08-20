package com.week7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.week6.NamedThread;  

class q1{  
public static void main(String args[]){
	NamedThread nt = new NamedThread(null);
	Connection con;  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con1=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo","root","kavisql78");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con1.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con1.close();  
		}
		catch(Exception e){
			System.out.println(e);
			}  
		
	
		String JdbcURL = "jdbc:mysql://localhost:3306/sonoo?useSSL=false";
		String Username = "root";
		String password = "kavisql78";
		
		try {
		   System.out.println("Connecting to database..............."+JdbcURL);
		   con=DriverManager.getConnection(JdbcURL, Username, password);
		   System.out.println("Connection is successful!!!!!!");
		}
		catch(Exception e) {
		   e.printStackTrace();
		}
	}
}  
