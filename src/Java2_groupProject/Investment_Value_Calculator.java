package Java2_groupProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class Investment_Value_Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Investment_Value_Calculator window = new Investment_Value_Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Investment_Value_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(283, 62, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 93, 123, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(283, 122, 123, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalculate.setBounds(315, 195, 91, 23);
		frame.getContentPane().add(btnCalculate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(127, 80, 1, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(10, 64, 150, 17);
		frame.getContentPane().add(lblInvestmentAmount);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(10, 93, 163, 20);
		frame.getContentPane().add(lblYears);
		
		JLabel lblAnualInterestRate = new JLabel("Anual Interest Rate");
		lblAnualInterestRate.setBounds(10, 124, 172, 17);
		frame.getContentPane().add(lblAnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(10, 153, 163, 14);
		frame.getContentPane().add(lblFutureValue);
	}
}
