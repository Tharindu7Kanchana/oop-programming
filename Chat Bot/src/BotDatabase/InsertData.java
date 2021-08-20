package BotDatabase;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public InsertData(String insertSql,String dbName){
        DatabaseIntialization di = new DatabaseIntialization();
        Statement st = di.CreateStatmentInDb(dbName);
        try {
            st.executeUpdate(insertSql);
            System.out.println("Insert Successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
