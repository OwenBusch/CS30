package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class BankingApp 
{

	private JFrame frame;
	
	private Account personalAcct;
	private Account businessAcct;
	private PersonalAcct pAcc = new PersonalAcct();
	private BusinessAcct bAcc = new BusinessAcct();
	private JTextField amountField;

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
					BankingApp window = new BankingApp();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BankingApp() 
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
		
		JLabel titleLabel = new JLabel("Welcome!");
		titleLabel.setForeground(new Color(51, 255, 153));
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(104, 0, 225, 45);
		frame.getContentPane().add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("Please select which account to edit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(119, 40, 196, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel balanceLabel = new JLabel("Your balance is: ");
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setBounds(137, 119, 159, 14);
		frame.getContentPane().add(balanceLabel);
		balanceLabel.setVisible(false);
		
		amountField = new JTextField();
		amountField.setBounds(174, 186, 86, 20);
		frame.getContentPane().add(amountField);
		amountField.setColumns(10);
		
		JComboBox accountBox = new JComboBox();
		accountBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(accountBox.getSelectedIndex() == 1)
				{
					personalAcct = new Account(250, "Owen", "Busch", "227 Covepark Place NE", "Calgary", "AB", "T3K 5Z8");
					balanceLabel.setVisible(true);
					balanceLabel.setText("Your balance is: $" + personalAcct.balance);
				}
			}
		});
		accountBox.setModel(new DefaultComboBoxModel(new String[] {"(Select account here)", "Personal Account", "Business Account"}));
		accountBox.setBounds(143, 86, 148, 22);
		frame.getContentPane().add(accountBox);
		
		JButton cfrmDpst = new JButton("Deposit");
		cfrmDpst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(accountBox.getSelectedIndex() == 1)
				{
					personalAcct.balance += Double.parseDouble(amountField.getText());
					balanceLabel.setText("Your balance is: $" + personalAcct.balance);
				}
			}
		});
		cfrmDpst.setBounds(172, 217, 89, 23);
		frame.getContentPane().add(cfrmDpst);
		cfrmDpst.setVisible(false);
		
		JButton cfrmWthd = new JButton("Withdraw");
		cfrmWthd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(accountBox.getSelectedIndex() == 1)
				{
					personalAcct.balance -= Double.parseDouble(amountField.getText());
					balanceLabel.setText("Your balance is: $" + personalAcct.balance);
					
					if(personalAcct.balance < pAcc.minimumBalance)
					{
						pAcc.acct = personalAcct;
						pAcc.ChargeForBalance();
						System.out.println(personalAcct.balance + " " + pAcc.acct.balance);
						balanceLabel.setText("Your balance is: $" + personalAcct.balance);
					}
				}
			}
		});
		cfrmWthd.setBounds(172, 217, 89, 23);
		frame.getContentPane().add(cfrmWthd);
		cfrmWthd.setVisible(false);
		
		JButton withdrawBtn = new JButton("Withdraw Money");
		withdrawBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		withdrawBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cfrmDpst.setVisible(false);
				cfrmWthd.setVisible(true);
			}
		});
		withdrawBtn.setBounds(93, 144, 118, 23);
		frame.getContentPane().add(withdrawBtn);
		
		JButton depositBtn = new JButton("Deposit Money");
		depositBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cfrmWthd.setVisible(false);
				cfrmDpst.setVisible(true);
			}
		});
		depositBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		depositBtn.setBounds(221, 144, 118, 23);
		frame.getContentPane().add(depositBtn);	
	}
}
