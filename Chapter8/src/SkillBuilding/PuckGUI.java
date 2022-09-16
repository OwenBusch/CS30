package SkillBuilding;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PuckGUI {

	private JFrame frame;
	
	double minWeight;
	double maxWeight;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuckGUI window = new PuckGUI();
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
	public PuckGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon puckImage = new ImageIcon("../Chapter8/src/Images/hockey-puck-6242769-5107018.png");
		
		String[] options = {"Select a size","Standard Size", "Child Size"};	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HockeySupplies.com");
		lblNewLabel.setBounds(10, 13, 145, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel thanksLabel = new JLabel("");
		thanksLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		thanksLabel.setBounds(0, 0, 424, 14);
		panel.add(thanksLabel);
		
		JLabel puck = new JLabel(puckImage);
		puck.setHorizontalAlignment(SwingConstants.CENTER);
		puck.setBounds(20, 63, 140, 140);
		frame.getContentPane().add(puck);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(175, 44, 259, 217);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Standard Hockey Puck");
		lblNewLabel_1.setBounds(10, 11, 143, 15);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2 = new JLabel("Thickness: 1 inch");
		lblNewLabel_2.setBounds(10, 25, 143, 22);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Diameter: 3 inches");
		lblNewLabel_2_1.setBounds(10, 46, 143, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel WeightLabel = new JLabel("Weight: Select a size");
		WeightLabel.setBounds(10, 70, 143, 22);
		panel_1.add(WeightLabel);
		
		JComboBox comboBox = new JComboBox(options);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedIndex() == 1)
				{
					determineWeight(true);
					
					WeightLabel.setText("Weight: " + minWeight + " - " + maxWeight);
					
				}
				else if(comboBox.getSelectedIndex() == 2)
				{
					determineWeight(false);
					
					WeightLabel.setText("Weight: " + minWeight + " - " + maxWeight);
				}
				else
				{
					WeightLabel.setText("Weight: Select a size");
					return;
				}
			}
		});
		comboBox.setBounds(10, 103, 143, 22);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("PURCHASE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedIndex() == 1)
				{
					thanksLabel.setText("! Thank you for purchasing the: Standard Size Hockey Puck !");
				}
				else if(comboBox.getSelectedIndex() == 2)
				{
					thanksLabel.setText("! Thank you for purchasing the: Child Size Hockey Puck !");
				}
				else
				{
					thanksLabel.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(204, 102, 102));
		btnNewButton.setBounds(10, 142, 175, 44);
		panel_1.add(btnNewButton);
		
		

		
	}
	
	public void determineWeight(boolean standardSize)
	{
		if(standardSize)
		{
			minWeight = 5.0;
			maxWeight = 5.5;
		}
		else
		{
			minWeight = 4.0;
			maxWeight = 4.5;
		}
	}
}
