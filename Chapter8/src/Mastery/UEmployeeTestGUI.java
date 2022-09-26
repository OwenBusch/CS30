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

public class UEmployeeTestGUI 
{

	String[] employee = UEmployee.employees();
	
	double salary[] = UEmployee.salary();
	
	String[] department = Faculty.department();
	
	String[] jobTitle = Staff.jobTitle();
	
	int idNum;
	
	private JFrame frame;
	private JTextField idInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UEmployeeTestGUI window = new UEmployeeTestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UEmployeeTestGUI() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		idInput = new JTextField();
		idInput.setBounds(67, 139, 110, 20);
		frame.getContentPane().add(idInput);
		idInput.setColumns(10);
		
		JLabel welcomeLabel = new JLabel("Welcome: Name");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(246, 93, 125, 14);
		frame.getContentPane().add(welcomeLabel);
		welcomeLabel.setVisible(false);
		
		JLabel salaryLabel = new JLabel("Your Salary is: __ /hr");
		salaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		salaryLabel.setBounds(228, 118, 161, 14);
		frame.getContentPane().add(salaryLabel);
		salaryLabel.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(131, 11, 172, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please login (0-3)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(59, 78, 125, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel errorLabel = new JLabel("Enter a valid ID");
		errorLabel.setForeground(Color.RED);
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setBounds(59, 118, 125, 14);
		frame.getContentPane().add(errorLabel);
		errorLabel.setVisible(false);	
		
		JLabel departmentLabel = new JLabel("Your department is: ");
		departmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		departmentLabel.setBounds(194, 143, 230, 14);
		frame.getContentPane().add(departmentLabel);
		departmentLabel.setVisible(false);
		
		JLabel positionLabel = new JLabel("Your position today is:");
		positionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		positionLabel.setBounds(194, 168, 230, 14);
		frame.getContentPane().add(positionLabel);
		positionLabel.setVisible(false);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				GetEmployee();
				
				if(idNum > UEmployee.employees().length)
				{
					errorLabel.setVisible(true);
					
					welcomeLabel.setVisible(false);
					salaryLabel.setVisible(false);
					departmentLabel.setVisible(false);
					positionLabel.setVisible(false);
				}
				else if(idNum <= employee.length)
				{
					errorLabel.setVisible(false);
					welcomeLabel.setVisible(true);
					salaryLabel.setVisible(true);
					departmentLabel.setVisible(true);
					positionLabel.setVisible(true);
					welcomeLabel.setText("Welcome: " + employee[idNum]);
					salaryLabel.setText("Your salary is: $" + Double.toString(salary[idNum]) + "/hr");
					departmentLabel.setText("Your department is: " + department[idNum]);
					positionLabel.setText("Your position today is: " + jobTitle[idNum]);
				}		
			}
		});
		btnNewButton.setBounds(72, 170, 100, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void GetEmployee()
	{		
		if(idInput.getText() != null)
		{
			idNum = Integer.parseInt(idInput.getText());
		}		
	}
}
