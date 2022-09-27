package Mastery;

public class PersonalAcct 
{
	public Account acct;
	
	public static double minimumBalance = 100;
	
	private boolean chargedForBalance = true;
	
	public double chargeAmount = 2;
	
	public void ChargeForBalance()
	{
		acct.getBalance();
		
		if(acct.balance > minimumBalance)
		{
			chargedForBalance = false;
			
			if(chargedForBalance = false)
			{
				acct.balance -= chargeAmount;
			}
		}
		
	}
}
