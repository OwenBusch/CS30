package Intro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import com.phidget22.*;

public class Game 
{

	private JFrame frame;

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
					Game window = new Game();
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
	 * @throws Exception 
	 */
	public Game() throws Exception 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel welcomeLabel = new JLabel("WELCOME");
		welcomeLabel.setForeground(new Color(255, 255, 153));
		welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 29));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel startPrompt = new JLabel("PRESS BOTH BUTTONS TO START");
		startPrompt.setForeground(new Color(255, 0, 102));
		startPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		startPrompt.setFont(new Font("Impact", Font.PLAIN, 19));
		
		boolean titleScreen = true;
		
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();
		
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		
		redButton.open(1000);
		greenButton.open(1000);
		
		while(true)
		{
			if(redButton.getState() == true && greenButton.getState() == true)
			{
				System.out.println("Both Buttons Pressed");
				Thread.sleep(150);
			}
		}
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(90)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
						.addComponent(startPrompt, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
					.addGap(90))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addGap(107)
					.addComponent(startPrompt, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(52))
		);
		
		frame.getContentPane().setLayout(groupLayout);
		
		
		
	}
}
