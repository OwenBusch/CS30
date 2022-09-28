package Mastery;

public class BusinessAcct 
{
	private Account acct;
	
	private double minimumBalance = 500;
	
	private boolean chargedForBalance = true;
	
	public double chargeAmount = 2;
	
	public void ChargeForBalance()
	{
		acct.getBalance();
		
		if(acct.balance > minimumBalance)
		{
			chargedForBalance = false;
		}
		
		if(chargedForBalance = false)
		{
			acct.balance -= chargeAmount;
			chargedForBalance = true;
		}
	}
}
