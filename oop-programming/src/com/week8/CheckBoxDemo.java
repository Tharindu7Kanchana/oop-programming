package com.week8;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CheckBoxDemo
{
	public CheckBoxDemo()
	{
		Frame frm=new Frame("CheckBox Setting");
		
		Panel pnl=new Panel();
		
		Label food_pre=new Label("Programming Languages:");
		
		CheckboxGroup group_language=new CheckboxGroup();
		
		Checkbox chk_java=new Checkbox("Java",group_language,true);
		Checkbox chk_c=new Checkbox("C",group_language,false);
		Checkbox chk_c_plus=new Checkbox("C++",group_language,false);
		Checkbox chk_python=new Checkbox("Python",group_language,false);
		Checkbox chk_php=new Checkbox("PHP",group_language,false);
		
		pnl.add(food_pre);
		pnl.add(chk_java);
		pnl.add(chk_c);
		pnl.add(chk_c_plus);
		pnl.add(chk_python);
		pnl.add(chk_php);
		
		
		frm.add(pnl);
		frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );

		frm.setSize(500,400);
		frm.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CheckBoxDemo();
	}
}