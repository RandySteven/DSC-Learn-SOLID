package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductView extends JFrame{

	JPanel northPanel, centerPanel, southPanel;
	
	private void init() {
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		north();
		center();
		south();
	}
	
	JLabel lblTitle;
	private void north() {
		lblTitle = new JLabel("Products");
		northPanel.add(lblTitle);
	}
	
	JPanel centerRightPanel;
	private void center() {
		centerPanel.setLayout(new GridLayout(0, 2));
		centerRightPanel = new JPanel();		
		centerLeft();
		centerRight();
	}
	
	JTable tblProduct;
	JScrollPane scpTblProduct;
	private void centerLeft() {
		tblProduct = new JTable();
		scpTblProduct = new JScrollPane();
		
		table();
		
		scpTblProduct.getViewport().add(tblProduct);
		
		centerPanel.add(scpTblProduct);
	}
	
	private void table() {
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Product's Name");
		model.addColumn("Product's Price");
		model.addColumn("Product's Stock");
		model.addColumn("Category");
		
		tblProduct.setModel(model);
	}
	
	private void centerRight() {
		centerRightPanel.setLayout(new BorderLayout());
		
		/**
		 * Center Right Attributes Init
		 * 1. JPanel
		 * 2. JLabel
		 * 3. JText
		 * 4. JButton
		 */
		JPanel centerRightNorthPanel = new JPanel();
		JPanel centerRightCenterPanel = new JPanel();
		JPanel centerRightSouthPanel = new JPanel();
		
		JLabel lblProductName = new JLabel("Product's Name");
		JLabel lblProductPrice = new JLabel("Product's Price");
		JLabel lblProductStock = new JLabel("Product's Stock");
		JLabel lblCategory = new JLabel("Category");
		
		JTextField txtProductName = new JTextField();
		JTextField txtProductPrice = new JTextField();
		JTextField txtProductStock = new JTextField();
		
		JButton btnAddProduct = new JButton("Add Product");
		JButton btnDeleteProduct = new JButton("Delete Product");
		JButton btnUpdateProduct = new JButton("Update Product");
		
		centerRightPanel.add(centerRightNorthPanel, BorderLayout.NORTH);
		centerRightPanel.add(centerRightCenterPanel, BorderLayout.CENTER);
		centerRightPanel.add(centerRightSouthPanel, BorderLayout.SOUTH);
		
		/**
		 * Center Right Panel North Position
		 */
		centerRightNorthPanel.add(new JLabel("Product's Management"));
		
		/**
		 * Center Right Panel Center Position
		 */
		centerRightCenterPanel.setLayout(new GridLayout(4, 2));
		centerRightCenterPanel.add(lblProductName);
		centerRightCenterPanel.add(txtProductName);
		centerRightCenterPanel.add(lblProductPrice);
		centerRightCenterPanel.add(txtProductPrice);
		centerRightCenterPanel.add(lblProductStock);
		centerRightCenterPanel.add(txtProductStock);
		centerRightCenterPanel.add(lblCategory);

		/**
		 * Center Right PAnel South Position
		 */
		centerRightSouthPanel.setLayout(new FlowLayout());
		centerRightSouthPanel.add(btnAddProduct);
		centerRightSouthPanel.add(btnUpdateProduct);
		centerRightSouthPanel.add(btnDeleteProduct);
		
		//
		centerPanel.add(centerRightPanel);
	}
	
	private void south() {
		
	}
	
	public ProductView() {
		setVisible(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		init();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
