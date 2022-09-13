import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class DivisGUI {

	private JFrame frame;
	private JTextField inputField;
	private JButton divisibleButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisGUI window = new DivisGUI();
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
	public DivisGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Divisible by 3?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblByOwenBusch = new JLabel("By: Owen Busch");
		lblByOwenBusch.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel dividedNumber = new JLabel("Response will show up here");
		dividedNumber.setHorizontalAlignment(SwingConstants.CENTER);
		
		inputField = new JTextField();
		inputField.setHorizontalAlignment(SwingConstants.CENTER);
		inputField.setColumns(10);
		
		
		JLabel ResponseLabel = new JLabel("Yes or no?");
		ResponseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		divisibleButton = new JButton("Divisible?");		
		divisibleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{				
				String eventName = e.getActionCommand();
				 
				if(eventName.equals("Divisible?"))
				{					 
					if(!inputField.getText().equals(""))
					{
						int num = Integer.parseInt(inputField.getText()); 
						 
						int newNum = num % 3;
						 
						if(newNum == 0)
						{
							ResponseLabel.setText("YES");
							
							dividedNumber.setText(inputField.getText() + " divided by 3 is: " + (num / 3));
						}
						else 
						{
							ResponseLabel.setText("NO");
							dividedNumber.setText(inputField.getText() + " is not divisible by 3");
						}
					}
					else
					{
						System.out.println("Enter a number");
						return;
					}
				}			
			}
		});
		divisibleButton.setActionCommand("Divisible?");
		


		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(156)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblByOwenBusch, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(168, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(121, Short.MAX_VALUE)
					.addComponent(inputField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(divisibleButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ResponseLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(dividedNumber, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
					.addGap(49))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(79)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(inputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(divisibleButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(127)
							.addComponent(ResponseLabel)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dividedNumber, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(lblByOwenBusch)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
