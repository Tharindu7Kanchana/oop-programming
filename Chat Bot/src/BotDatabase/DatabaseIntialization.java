package BotDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseIntialization {

    Statement CreateStatment() {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","kavisql78");
            System.out.println("Connection established");
            Statement st = con.createStatement();
            return st;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    Statement CreateStatmentInDb(String dbName) {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName,"root","kavisql78");
            System.out.println("Connection established");
            Statement st = con.createStatement();
            return st;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    void createDatabase(String db) {
        Statement st = CreateStatment();
        try {
            st.executeUpdate("CREATE DATABASE " + db);

            System.out.println("Database Created");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

