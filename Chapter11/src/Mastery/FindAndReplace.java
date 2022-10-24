package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Window.Type;
import java.io.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FindAndReplace {

	private JFrame frame;
	private JTextField replaceField;
	private JTextField findField;
	private JTextField textField;
	
	File textFile;
	File newFile;
	
	FileWriter out;
	BufferedWriter writeFile;
	
	int count = 0;
	
	String wordToReplace;
	String replacementWord;
	String fileName;
	
	
	FileReader in;
	BufferedReader readFile;
	String lineOfText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindAndReplace window = new FindAndReplace();
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
	public FindAndReplace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 448, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Find:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblReplaceWith = new JLabel("Replace With:");
		lblReplaceWith.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		textField.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				textFile = new File("..\\Chapter11\\src\\Mastery\\" + textField.getText());
				System.out.println(textFile);
			}
		});
		
		findField = new JTextField();
		findField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		findField.setHorizontalAlignment(SwingConstants.LEFT);
		findField.setColumns(10);
		
		
		
		replaceField = new JTextField();
		replaceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		replaceField.setHorizontalAlignment(SwingConstants.LEFT);
		replaceField.setColumns(10);
		
		JButton cnfrmBtn = new JButton("Find/Replace");
		cnfrmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wordToReplace = findField.getText();
				replacementWord = replaceField.getText();
	
				try
				{
					in = new FileReader(textFile); 
					readFile = new BufferedReader(in);
					fileName = (textField.getText());
					fileName = fileName.replace(".", "NEW.");
					newFile = new File("..\\Chapter11\\src\\Mastery\\" + fileName);
					out = new FileWriter(newFile);
					writeFile = new BufferedWriter(out);
					while((lineOfText = readFile.readLine()) != null)
					{									
						lineOfText = lineOfText.replaceAll(wordToReplace, replacementWord);
						writeFile.write(lineOfText);
						writeFile.newLine();
						System.out.println("File modified");
						System.out.println(textFile.toString());
					}
					writeFile.close();
					out.close();
					readFile.close();
					in.close();
					
				}
				catch(FileNotFoundException s)
				{
					System.out.println("File does not exist or could not be found");
					System.err.println("FileNotFoundException: " + s.getMessage());
				}
				catch(IOException s)
				{
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + s.getMessage());
				}
			}
		});
		
		JButton closeBtn = new JButton("Close");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		JLabel nameField = new JLabel("File Name:");
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(nameField, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(submit, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(closeBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cnfrmBtn, Alignment.TRAILING)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblReplaceWith, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(findField, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
								.addComponent(replaceField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))))
					.addGap(22))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(findField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(replaceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblReplaceWith))
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cnfrmBtn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(closeBtn))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(submit)))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
}
