package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class UEmplyee {

	String employee[] = {"Johnny", "Carlos", "Jenn", "Patty"};
	
	double salary[] = {13, 20, 15, 17};
	
	int idNum;
	
	private JFrame frame;
	private JTextField idInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UEmplyee window = new UEmplyee();
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
	public UEmplyee() {
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
		
		idInput = new JTextField();
		idInput.setBounds(162, 114, 110, 20);
		frame.getContentPane().add(idInput);
		idInput.setColumns(10);
		
		JLabel welcomeLabel = new JLabel("Welcome: Name");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(154, 179, 125, 14);
		frame.getContentPane().add(welcomeLabel);
		welcomeLabel.setVisible(false);
		
		JLabel salaryLabel = new JLabel("Your Salary is: __ /hr");
		salaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaryLabel.setBounds(154, 204, 125, 14);
		frame.getContentPane().add(salaryLabel);
		salaryLabel.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(131, 11, 172, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please login (0-3)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(154, 53, 125, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel errorLabel = new JLabel("Enter a valid ID");
		errorLabel.setForeground(Color.RED);
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setBounds(154, 93, 125, 14);
		frame.getContentPane().add(errorLabel);
		errorLabel.setVisible(false);	
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GetEmployee();
				
				if(idNum > employee.length || idInput.getText() == null)
				{
					errorLabel.setVisible(true);
					
					welcomeLabel.setText("");
					salaryLabel.setText("");
				}
				else if(idNum <= employee.length)
				{
					errorLabel.setVisible(false);
					welcomeLabel.setVisible(true);
					salaryLabel.setVisible(true);
					welcomeLabel.setText("Welcome: " + employee[idNum]);
					salaryLabel.setText("Your salary is: " + Double.toString(salary[idNum]) + "/hr");
				}		
			}
		});
		btnNewButton.setBounds(167, 145, 100, 23);
		frame.getContentPane().add(btnNewButton);		
	}
	
	public void GetEmployee()
	{
		idNum = Integer.parseInt(idInput.getText());
	
	}
}
