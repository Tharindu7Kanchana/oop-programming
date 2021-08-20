package BotDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
    public ResultSet Retrive(String sql, String dbName) {
        DatabaseIntialization di = new DatabaseIntialization();
        Statement st = di.CreateStatmentInDb(dbName);
        try {
            return st.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
