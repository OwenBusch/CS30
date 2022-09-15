/*

Program: MetricGUI.java          Last Date of this Revision: September 13, 2022

Purpose: An application that has a few selections of metric conversions.

Author: Owen Busch, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionListener;

public class MetricGUI {

	
	
	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricGUI window = new MetricGUI();
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
	public MetricGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] conversions = {"Feet to Meters", "Inches to Centimeters", "Gallons to Liters", "Pounds to Kilograms"};
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setBounds(97, 137, 242, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel output = new JLabel("(Conversion Here)");
		output.setBounds(97, 183, 242, 14);
		output.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox = new JComboBox(conversions);
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String selection = (String)comboBox.getSelectedItem();
				
				if(selection == "Feet to Meters")
				{
					double num = Integer.parseInt(input.getText());
					
					double newNum = num * 0.3;
					
					output.setText(num + " feet is equal to " + newNum + " meters.");
				}
				else if(selection == "Inches to Centimeters")
				{
					double num = Integer.parseInt(input.getText());
					
					double newNum = num * 2.54;
					
					output.setText(num + " inches is equal to " + newNum + " centimeters.");
				}
				else if(selection == "Gallons to Liters")
				{
					double num = Integer.parseInt(input.getText());
					
					double newNum = num * 4.5;
					
					output.setText(num + " gallons is equal to " + newNum + " gallons.");
				}
				else if(selection == "Pounds to Kilograms")
				{
					double num = Integer.parseInt(input.getText());
					
					double newNum = num * 0.45;
					
					output.setText(num + " pounds is equal to " + newNum + " kilograms.");
				}
				
			}
		});
		comboBox.setBounds(97, 157, 242, 20);
		
		JLabel lblNewLabel_1 = new JLabel("Metric Conversions");
		lblNewLabel_1.setBounds(97, 11, 242, 14);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		input = new JTextField();
		input.setBounds(97, 111, 242, 20);
		input.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Input measurement");
		lblNewLabel_2.setBounds(97, 91, 242, 14);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(comboBox);
		frame.getContentPane().add(output);
		frame.getContentPane().add(input);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("By: Owen Busch");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(97, 236, 242, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
