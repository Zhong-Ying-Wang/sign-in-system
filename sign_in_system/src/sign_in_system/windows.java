package sign_in_system;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class windows {

	private JFrame f = new JFrame();
	JTextField account = new JTextField();
	JTextField password = new JTextField();

	public windows(){
		this.graphics();
	}
	
	public void graphics(){
		
		f.setTitle("�|���n�J�t��");
		f.setSize(500,200);
		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		f.setBackground(Color.BLUE);
		
		/*--------------��J��------------------------*/
		JPanel input_panel = new JPanel();
			
		f.add(input_panel);
				
		input_panel.setBounds(0, 0, 400, 100);
		input_panel.setLayout(new GridLayout(2,1));
			
		input_panel.add(account);
		input_panel.add(password);
				
		/*---------------�n�Jbutton----------------------*/	
			
		JPanel run_input = new JPanel();
		f.add(run_input,BorderLayout.EAST);
		
		
		run_input.setBounds(400, 0, 100, 100);
		run_input.setLayout(new GridLayout(1,1));
		
		JButton get_in_system = new JButton("�n�J");
		get_in_system.setBounds(400,0,100,100);
		run_input.add(get_in_system);
		
		/*-----------------��L�\��button------------------------------*/
		
		JPanel else_function  = new JPanel();
		
		f.add(else_function,BorderLayout.SOUTH);
		else_function.setBounds(0,101,500,70);
		else_function.setLayout(new GridLayout(1,2));
		
		
		JButton new_account = new JButton("���U");
		else_function.add(new_account);
		
		JButton forget_account = new JButton("�ѰO�K�X");
		else_function.add(forget_account);
		
	
		
		
		
	}
}
