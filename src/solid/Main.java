package solid;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import view.LoginView;
import view.ProductView;
import view.RegisterView;

public class Main{
	
	RegisterView registerView;
	LoginView loginView;
	public Main() {
		registerView = new RegisterView();
	}

	public static void main(String[] args) {
		new Main();
	}

}
