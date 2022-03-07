package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame{

	private final int HEIGHT = 300;
	private final int WIDHT = 500;
	
	JPanel northPanel, centerPanel, southPanel;
	void init() {
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		north();
		center();
		south();
		
		onClick();
	}
	
	JLabel lblTitle;
	private void north() {
		lblTitle = new JLabel("Login");
		northPanel.add(lblTitle);
	}
	
	JLabel lblEmail, lblPassword;
	JTextField txtEmail;
	JPasswordField txtPassword;
	private void center() {
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		txtEmail = new JTextField();
		txtPassword = new JPasswordField();
		
		centerPanel.setLayout(new GridLayout(2, 2));
		centerPanel.add(lblEmail);
		centerPanel.add(txtEmail);
		centerPanel.add(lblPassword);
		centerPanel.add(txtPassword);
	}
	
	JButton btnLogin;
	private void south() {
		btnLogin = new JButton("Login");
		southPanel.add(btnLogin);
	}
	
	private void onClick() {
		
	}
	
	public LoginView() {
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(new BorderLayout());
		init();
		setSize(WIDHT, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
