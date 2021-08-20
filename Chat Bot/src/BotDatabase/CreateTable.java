package BotDatabase;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public CreateTable(String tableSql,String dbName){
        DatabaseIntialization di = new DatabaseIntialization();
        Statement st = di.CreateStatmentInDb(dbName);
        try {
            st.executeUpdate(tableSql);
            System.out.println("Table created");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
