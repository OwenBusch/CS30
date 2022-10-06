package SkillBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MyFileGUI 
{

	private JFrame frame;
	private JTextField input;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

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
					MyFileGUI window = new MyFileGUI();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFileGUI() 
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
		
		input = new JTextField();
		input.setBounds(126, 134, 181, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel output = new JLabel("");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(0, 197, 436, 53);
		frame.getContentPane().add(output);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				File textFile = new File(input.getText());
				if(textFile.exists())
				{
					output.setText("The file " + input.getText() + " does exist.");
				}
				else if(!textFile.exists())
				{
					try
					{
						textFile.createNewFile();
						output.setText("File " + textFile.getName() + " was created.");
						textFile.deleteOnExit();
					}
					catch (IOException er)
					{
						output.setText("File could not be created.");
						System.err.println("IOException : " + er.getMessage());
					}
				}
			}
		});
		btnNewButton.setBounds(172, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("DOES THE FILE EXIST?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(110, 11, 214, 46);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Enter file directory and name here");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(118, 109, 197, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
