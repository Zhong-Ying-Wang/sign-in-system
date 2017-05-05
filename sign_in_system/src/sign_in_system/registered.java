package sign_in_system;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class registered {
	
	JFrame r = new JFrame();
	JTextField account_new_input = new JTextField();
	JTextField password_new_input = new JTextField();
	JTextField password_new_input_retry = new JTextField();
	JTextField Verification_code_input = new JTextField();

	public registered(){
		this.registered_interface();
	}
	
	public void registered_interface(){
		r.setTitle("註冊");
		r.setSize(600,400);
		r.setResizable(false);
		r.setDefaultCloseOperation(3);
		r.setLocationRelativeTo(null);
		r.setLayout(null);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setVisible(true);
		
		/*---------------註冊欄位---------------------------*/
		JPanel new_account = new JPanel();
		
		r.add(new_account);
		
		new_account.setLayout(new GridLayout(4,1));
		new_account.setBounds(0, 0, 100, 100);
		
		JLabel account_show = new JLabel("帳號 :",SwingConstants.RIGHT);			//SwingConstants 字的位子設定
		account_show.setFont(new Font("",Font.BOLD,15));
		
		JLabel password_show = new JLabel("密碼 :",SwingConstants.RIGHT);
		password_show .setFont(new Font("",Font.BOLD,15));
		
		JLabel password_compare = new JLabel("密碼驗證 :",SwingConstants.RIGHT);
		password_show.setFont(new Font("",Font.BOLD,15));
		
		JLabel Verification_code = new JLabel("驗證碼 :",SwingConstants.RIGHT);
		Verification_code.setFont(new Font("",Font.BOLD,15));
		
		new_account.add(account_show);
		new_account.add(password_show);
		new_account.add(password_compare);
		new_account.add(Verification_code);
		
		/*--------------------------------------------------*/
		
		JPanel new_account_input = new JPanel();
		
		r.add(new_account_input);
		
		new_account_input.setLayout(new GridLayout(4,1));
		new_account_input.setBounds(100, 0, 300,100);
		
		new_account_input.add(account_new_input);
		new_account_input.add(password_new_input);
		new_account_input.add(password_new_input_retry);
		new_account_input.add(Verification_code_input);
		
		
	}

}
