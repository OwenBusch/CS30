
/*

Program: PlateGUI.java          Last Date of this Revision: September 14, 2022

Purpose: an application that when you press a button it picks a number between 1 and 2 and depending on which you get you win or lose

Author: Owen Busch, 
School: CHHS
Course: Computer Programming 30
 

*/


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class PlateGUI {

	private JFrame frmBreakAPlate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlateGUI window = new PlateGUI();
					window.frmBreakAPlate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBreakAPlate = new JFrame();
		frmBreakAPlate.setTitle("Break A Plate");
		frmBreakAPlate.getContentPane().setBackground(Color.WHITE);
		frmBreakAPlate.setBounds(100, 100, 450, 300);
		frmBreakAPlate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBreakAPlate.getContentPane().setLayout(null);
		
		
		ImageIcon plates2 = new ImageIcon("../Chapter10/src/Images/plates_two_broken.gif ");
		
		ImageIcon plates3 = new ImageIcon("../Chapter10/src/Images/plates_all_broken.gif ");

		ImageIcon tiger = new ImageIcon("../Chapter10/src/Images/tiger_plush.gif ");

		ImageIcon sticker = new ImageIcon("../Chapter10/src/Images/sticker.gif ");
		
		JLabel plates = new JLabel(new ImageIcon("../Chapter10/src/Images/plates.gif"));
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(26, 0, 381, 99);
		frmBreakAPlate.getContentPane().add(plates);
		
		JLabel responseLabel = new JLabel(" ");
		responseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		responseLabel.setBounds(172, 132, 89, 14);
		frmBreakAPlate.getContentPane().add(responseLabel);
		
		JLabel prizeLabel = new JLabel(" ");
		prizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prizeLabel.setBounds(74, 151, 286, 99);
		frmBreakAPlate.getContentPane().add(prizeLabel);
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Random rand = new Random();
				
				int intRand = rand.nextInt(2);
				
				if(intRand == 0)
				{
					playButton.setText("Play Again?");
					responseLabel.setText("YOU LOSE");
					plates.setIcon(plates2);
					prizeLabel.setIcon(sticker);
				}
				else
				{
					playButton.setText("Play Again?");
					responseLabel.setText("YOU WIN!");
					plates.setIcon(plates3);
					prizeLabel.setIcon(tiger);
					
				}
			}
		});
		playButton.setBounds(166, 104, 101, 23);
		frmBreakAPlate.getContentPane().add(playButton);


	}
}
