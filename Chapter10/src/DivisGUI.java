import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JTextField InputField;

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
		
		JPanel greyPanel = new JPanel();
		greyPanel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblByOwenBusch = new JLabel("By: Owen Busch");
		lblByOwenBusch.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(156)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(greyPanel, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(160)
							.addComponent(lblByOwenBusch, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(greyPanel, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblByOwenBusch)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		InputField = new JTextField();
		InputField.setColumns(10);
		
		JLabel ResponseLabel = new JLabel("(TEMP)");
		
		JButton divisibleButton = new JButton("Divisible?");
		
		GroupLayout gl_greyPanel = new GroupLayout(greyPanel);
		gl_greyPanel.setHorizontalGroup(
			gl_greyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_greyPanel.createSequentialGroup()
					.addGap(67)
					.addComponent(InputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(divisibleButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ResponseLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		
		/*public void actionPerformed(ActionEvent event)
		{
			
		}*/
		
		gl_greyPanel.setVerticalGroup(
			gl_greyPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_greyPanel.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_greyPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_greyPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(ResponseLabel))
						.addGroup(gl_greyPanel.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_greyPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(InputField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(divisibleButton))))
					.addContainerGap(106, Short.MAX_VALUE))
		);
		greyPanel.setLayout(gl_greyPanel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
