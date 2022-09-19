package SkillBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;

public class MusicGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicGUI window = new MusicGUI();
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
	public MusicGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		
		ImageIcon noteImage = new ImageIcon("../Chapter8/src/Images/music-note.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Music Maker");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(132, 11, 169, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel p1Label = new JLabel("Player 1");
		p1Label.setBounds(10, 57, 46, 14);
		frame.getContentPane().add(p1Label);
		
		JLabel p2Label = new JLabel("Player 2");
		p2Label.setBounds(10, 82, 46, 14);
		frame.getContentPane().add(p2Label);
		
		JLabel p3Label = new JLabel("Player 3");
		p3Label.setBounds(10, 107, 46, 14);
		frame.getContentPane().add(p3Label);
		
		JLabel p4Label = new JLabel("Player 4");
		p4Label.setBounds(10, 132, 46, 14);
		frame.getContentPane().add(p4Label);
		
		JLabel lblNewLabel_1 = new JLabel(noteImage);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(238, 54, 153, 153);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel outputLabel = new JLabel("(Song outputs here)");
		outputLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outputLabel.setBounds(10, 236, 185, 14);
		frame.getContentPane().add(outputLabel);
		
		JComboBox comboBoxP1 = new JComboBox();		
		comboBoxP1.setModel(new DefaultComboBoxModel(new String[] {"None", "Vocals", "Piccolo", "Clarinet", "Piano", "Cymbal", "Drum"}));
		comboBoxP1.setBounds(66, 53, 129, 22);
		frame.getContentPane().add(comboBoxP1);
		
		JComboBox comboBoxP2 = new JComboBox();		
		comboBoxP2.setModel(new DefaultComboBoxModel(new String[] {"None", "Vocals", "Piccolo", "Clarinet", "Piano", "Cymbal", "Drum"}));
		comboBoxP2.setBounds(66, 78, 129, 22);
		frame.getContentPane().add(comboBoxP2);
		
		JComboBox comboBoxP3 = new JComboBox();		
		comboBoxP3.setModel(new DefaultComboBoxModel(new String[] {"None", "Vocals", "Piccolo", "Clarinet", "Piano", "Cymbal", "Drum"}));
		comboBoxP3.setBounds(66, 103, 129, 22);
		frame.getContentPane().add(comboBoxP3);
		
		JComboBox comboBoxP4 = new JComboBox();
		comboBoxP4.setModel(new DefaultComboBoxModel(new String[] {"None", "Vocals", "Piccolo", "Clarinet", "Piano", "Cymbal", "Drum"}));
		comboBoxP4.setBounds(66, 128, 129, 22);
		frame.getContentPane().add(comboBoxP4);
		
		JButton playButton = new JButton("PLAY!");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String player1Message = "";
				
				String player2Message = "";
				
				String player3Message = "";
				
				String player4Message = "";
				
				
				//Player 1
				if(comboBoxP1.getSelectedIndex() == 0)
				{
					player1Message = "...";
				}
				else if(comboBoxP1.getSelectedIndex() == 1)
				{
					player1Message = "LaLaLa";
				}
				else if(comboBoxP1.getSelectedIndex() == 2)
				{
					player1Message = "Peep";
				}
				else if(comboBoxP1.getSelectedIndex() == 3)
				{
					player1Message = "Squawk";
				}
				else if(comboBoxP1.getSelectedIndex() == 4)
				{
					player1Message = "Bong";
				}
				else if(comboBoxP1.getSelectedIndex() == 5)
				{
					player1Message = "Tsssss";
				}
				else if(comboBoxP1.getSelectedIndex() == 6)
				{
					player1Message = "Duns";
				}
				
				//Player 2
				if(comboBoxP2.getSelectedIndex() == 0)
				{
					player2Message = "...";
				}
				else if(comboBoxP2.getSelectedIndex() == 1)
				{
					player2Message = "LaLaLa";
				}
				else if(comboBoxP2.getSelectedIndex() == 2)
				{
					player2Message = "Peep";
				}
				else if(comboBoxP2.getSelectedIndex() == 3)
				{
					player2Message = "Squawk";
				}
				else if(comboBoxP2.getSelectedIndex() == 4)
				{
					player2Message = "Bong";
				}			
				else if(comboBoxP2.getSelectedIndex() == 5)
				{
					player2Message = "Tsssss";
				}
				else if(comboBoxP2.getSelectedIndex() == 6)
				{
					player2Message = "Duns";
				}
				
				//Player 3
				if(comboBoxP3.getSelectedIndex() == 0)
				{
					player3Message = "...";
				}
				else if(comboBoxP3.getSelectedIndex() == 1)
				{
					player3Message = "LaLaLa";
				}
				else if(comboBoxP3.getSelectedIndex() == 2)
				{
					player3Message = "Peep";
				}
				else if(comboBoxP3.getSelectedIndex() == 3)
				{
					player3Message = "Squawk";
				}
				else if(comboBoxP3.getSelectedIndex() == 4)
				{
					player3Message = "Bong";
				}
				else if(comboBoxP3.getSelectedIndex() == 5)
				{
					player3Message = "Tsssss";
				}
				else if(comboBoxP3.getSelectedIndex() == 6)
				{
					player3Message = "Duns";
				}
				
				//Player 4
				if(comboBoxP4.getSelectedIndex() == 0)
				{
					player4Message = "...";
				}
				else if(comboBoxP4.getSelectedIndex() == 1)
				{
					player4Message = "LaLaLa";
				}
				else if(comboBoxP4.getSelectedIndex() == 2)
				{
					player4Message = "Peep";
				}
				else if(comboBoxP4.getSelectedIndex() == 3)
				{
					player4Message = "Squawk";
				}
				else if(comboBoxP4.getSelectedIndex() == 4)
				{
					player4Message = "Bong";
				}
				else if(comboBoxP4.getSelectedIndex() == 5)
				{
					player4Message = "Tsssss";
				}
				else if(comboBoxP4.getSelectedIndex() == 6)
				{
					player4Message = "Duns";
				}
				
				String outputSong = player1Message + player2Message + player3Message + player4Message + "!";
				
				outputLabel.setText(outputSong);
			}
		});
		playButton.setBackground(new Color(144, 238, 144));
		playButton.setBounds(61, 173, 89, 23);
		frame.getContentPane().add(playButton);
		
		JLabel lblNewLabel_2 = new JLabel("By: Owen Busch");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(323, 236, 101, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		
		
	}
}
