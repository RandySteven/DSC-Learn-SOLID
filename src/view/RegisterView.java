package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterView extends JFrame{

	private final Integer WIDTH = 600;
	private final Integer HEIGHT = 800;
		
	JPanel northPanel, centerPanel, southPanel;
	void init() {
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.PAGE_END);
		
		north();
		System.out.println("North");
		center();
		System.out.println("Center");
		south();
		System.out.println("South");
		
		onClick();
	}
	
	JLabel lblTitle, lblName, lblEmail, lblPassword, lblGender, lblDoB, lblConfirmPassword, lblAddress;
	JTextField txtName, txtEmail;
	JTextArea txtAddress;
	JPasswordField txtPassword, txtConfirmPassword;
	JRadioButton rbMale, rbFemale;
	ButtonGroup bgGender;
	JPanel genderPanel;
	JComboBox<String> cmbDate;
	JComboBox<String> cmbMonth;
	JComboBox<String> cmbYear;
	private void north() {
		lblTitle = new JLabel("Register");
		northPanel.add(lblTitle);
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
	}
	
	private void center() {
		//initalisasi gridlayout
		centerPanel.setLayout(new GridLayout(8, 2));
		bgGender = new ButtonGroup();
		lblName = new JLabel("Name");
		lblEmail = new JLabel("Email");
		lblConfirmPassword = new JLabel("Confirm Password");
		lblAddress = new JLabel("Address");
		lblPassword = new JLabel("Password");
		lblGender = new JLabel("Gender");
		lblDoB = new JLabel("DoB");
		
		txtName = new JTextField();
		txtEmail = new JTextField();
		txtPassword = new JPasswordField();
		txtConfirmPassword = new JPasswordField();
		txtAddress = new JTextArea();
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		genderPanel = new JPanel(new FlowLayout());
		genderPanel.add(rbMale);
		genderPanel.add(rbFemale);
		bgGender.add(rbMale);
		bgGender.add(rbFemale);
		
		cmbDate = new JComboBox<String>();
		cmbMonth = new JComboBox<String>();
		cmbYear = new JComboBox<String>();

		for(int date = 1 ; date <= 31 ; date++) {
			String dateString = "";
			if(date < 10) {
				dateString = "0" + date;
			}else {
				dateString = "" + date;
			}
			cmbDate.addItem(dateString);
		}
		
		for(int month = 1 ; month <= 12 ; month ++) {
			String monthString = "";
			if(month < 10) {
				monthString = "0" + month;
			}else {
				monthString = "" + month;
			}
			cmbMonth.addItem(monthString);
		}
		
		for(int year = 1975 ; year <= 2001 ; year++) {
			String yearString = "" + year;
			cmbYear.addItem(yearString);
		}
		
		JPanel dobPanel = new JPanel();
		dobPanel.setLayout(new FlowLayout());
		dobPanel.add(cmbDate);
		dobPanel.add(cmbMonth);
		dobPanel.add(cmbYear);
		
		//xml
		
		centerPanel.add(lblName);
		centerPanel.add(txtName);
		centerPanel.add(lblEmail);
		centerPanel.add(txtEmail);
		centerPanel.add(lblPassword);
		centerPanel.add(txtPassword);
		centerPanel.add(lblConfirmPassword);
		centerPanel.add(txtConfirmPassword);
		centerPanel.add(lblAddress);
		centerPanel.add(txtAddress);
		centerPanel.add(lblDoB);
		centerPanel.add(dobPanel);
		centerPanel.add(lblGender);
		centerPanel.add(genderPanel);
	}
	
	JButton btnRegister, btnLogin;
	private void south() {
		btnRegister = new JButton("Register");
		btnLogin = new JButton("Login");
		
		southPanel.setLayout(new GridLayout(0, 2));
		southPanel.add(btnRegister);
		southPanel.add(btnLogin);
	}
	
	private void onClick() {
		
	}
	
	public RegisterView() {
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		//initialisasi layout borderlayout
		setLayout(new BorderLayout());
		init();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new RegisterView();
	}

}
