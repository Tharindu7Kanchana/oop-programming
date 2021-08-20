package com.week8;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class q2
{
	public q2()
	{
		Frame frm=new Frame("Types of Lists");
		
		Panel aPanel=new Panel();
		
		frm.add(aPanel);
		
		Label country=new Label("Country");
		
		List country_list=new List();
		country_list.add("Sri Lanka");
		country_list.add("India");
		country_list.add("England");
		country_list.add("Australia");
		country_list.setMultipleMode(true);
		
		Label sport=new Label("Sports");
		
		Choice aSport=new Choice();
		aSport.add("Cricket");
		aSport.add("FootBall");
		aSport.add("Chess");
		aSport.add("Swimming");
		
		aPanel.add(country);
		aPanel.add(country_list);
		
		aPanel.add(sport);
		aPanel.add(aSport);
		frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );

		frm.setSize(400,200);
		frm.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		new q2();
	}
}

