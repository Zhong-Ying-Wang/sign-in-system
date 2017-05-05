package sign_in_system;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class login {

	private JFrame f = new JFrame();
	JTextField account = new JTextField();
	JTextField password = new JTextField();

	public login(){
		this.graphics();
	}
	
	public void graphics(){
		
		f.setTitle("登入");
		f.setSize(500,180);
		f.setResizable(false);
		f.setDefaultCloseOperation(3);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		f.setBackground(Color.BLUE);
		
		/*-----------------帳號密碼輸入標籤--------------------------*/
		JPanel input_introduction = new JPanel();
		
		f.add(input_introduction);
		
		input_introduction.setLayout(new GridLayout(2,1));
		input_introduction.setBounds(0, 0, 50, 100);
		
		JLabel account_show = new JLabel("帳號 : ",JLabel.CENTER);
		JLabel password_show = new JLabel("密碼 :",JLabel.CENTER);
		
		input_introduction.add(account_show);
		input_introduction.add(password_show);
		/*--------------輸入框------------------------*/
		JPanel input_panel = new JPanel();
			
		f.add(input_panel);
				
		input_panel.setBounds(50, 0, 350, 100);
		input_panel.setLayout(new GridLayout(2,1));
			
		input_panel.add(account);
		input_panel.add(password);
				
		/*---------------登入button----------------------*/	
			
		JPanel run_input = new JPanel();
		f.add(run_input,BorderLayout.EAST);
		
		
		run_input.setBounds(400, 0, 100, 100);
		run_input.setLayout(new GridLayout(1,1));
		
		JButton get_in_system = new JButton("登入");
		get_in_system.setBounds(0,0,100,100);
		run_input.add(get_in_system);
		
		/*-----------------其他功能button--------------------*/
		
		JPanel else_function  = new JPanel();
		
		f.add(else_function,BorderLayout.SOUTH);
		else_function.setBounds(0,101,500,70);
		else_function.setLayout(new GridLayout(1,2));
		
		
		JButton new_account = new JButton("註冊");
		new_account.setBounds(0,0,250,50);
		else_function.add(new_account);
		
		JButton forget_account = new JButton("忘記密碼");
		forget_account.setBounds(250,0,250,50);
		else_function.add(forget_account);
		
	}
}
