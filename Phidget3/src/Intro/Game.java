package Intro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.phidget22.PhidgetException;

import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Game 
{
	
	static boolean initialized = false;

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws PhidgetException 
	 */
	

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public Game()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowOpened(WindowEvent e) 
			{
				while(true)
				{
					try 
					{
						if(GameLogic.greenButtonInput() == true && GameLogic.redButtonInput() == true)
						{
							System.out.println("Both Buttons Pressed, starting now");
						}
					} 
					catch (PhidgetException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	
			}
		});
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
	
	public static void main(String[] args) throws PhidgetException 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				Game window = new Game();
				window.frame.setVisible(true);
				
				try 
				{
					GameLogic.ControllerInitializion();
					//readInput();
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public static void readGreenInput() throws PhidgetException
	{
		if(GameLogic.greenButtonInput() == true)
		{
			System.out.println("Green Pressed");
		}	
	}
	
}
