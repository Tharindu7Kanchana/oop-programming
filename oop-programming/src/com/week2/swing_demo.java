package com.week2;
import javax.swing.JButton;
import javax.swing.JFrame;

public class swing_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       JButton button1 = new JButton("Preee");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.getContentPane().add(button1);
	       frame.setVisible(true);

	}

}
