package com.week8;
import java.awt.*;

public class gui1 {
	public static void main(String[] args) {
		Panel panel = new Panel();
		Frame frame = new Frame();
		
		Label lable1 = new Label("Name");
		TextField txtField = new TextField(10);
		panel.add(lable1);
		panel.add(txtField);
		panel.add(new Label("Password"));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,100,50));
		panel.add(new TextField(10));
		panel.add(new Button("Enter"));
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);
		
		
	}
}
