package BotGui;

import BotDatabase.InsertData;
import BotDatabase.RetriveData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BotUI {
    private JButton sendButton;
    private JTextField textField1;
    private JLabel rLabel;
    private JPanel panel;
    private JButton lastRecordButton;
    private String dbName = "ChatBot";

    public BotUI() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st = textField1.getText().toString();
                String sql = "INSERT INTO chat VALUES(\"Kavishka\",\"Tharindu\",\"" + st + "\")";
                new InsertData(sql,dbName);
            }
        });
        lastRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RetriveData rd = new RetriveData();
                ResultSet rs = rd.Retrive("SELECT message FROM chat LIMIT 1",dbName);
                String st = null;
                try {
                    rs.next();
                    st = rs.getString(1);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                rLabel.setText(st);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BotUI");
        frame.add(new BotUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}