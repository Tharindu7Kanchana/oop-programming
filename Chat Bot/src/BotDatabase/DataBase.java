//package BotDatabase;
//
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DataBase {
//    private static void DeleteTable(String dbName){
//        Statement st = new DatabaseIntialization().CreateStatmentInDb(dbName);
//        try {
//            st.execute("DROP DATABASE " + dbName);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//    public static void main(String[] args) {
//        DatabaseIntialization di = new DatabaseIntialization();
//        di.createDatabase("ChatBot");
//        new CreateTable("CREATE TABLE chat(sender varchar(20),receiver varchar(20),message text)","ChatBot");
//        new CreateTable("CREATE TABLE user(UID int(3) PRIMARY KEY AUTO_INCREMENT,name varchar(20))","ChatBot");
//        new InsertData("INSERT INTO chat VALUES('Kavishka','Tharindu','Hello ChatBot')","ChatBot");
//        new InsertData("INSERT INTO user VALUES('111','Kavishka')","ChatBot");
//        //DeleteTable("ChatBot");
//    }
//}
