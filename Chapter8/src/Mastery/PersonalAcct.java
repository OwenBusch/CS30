package Mastery;

public class PersonalAcct extends Account
{
	//public static Account personalAcct = new Account(250, "Owen", "Busch", "227 Covepark Place NE", "Calgary", "AB", "T3K 5Z8");
	
	public static double minimumBalance = 100;
	
	public static double chargeAmount = 2;
	
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
	{
		super(bal, "Owen", "Busch", "227 Covepark Place NE", "Calgary", "AB", "T3K5Z8");
	}
	
	public void withdrawal(double amt)
	{
		if(amt <= super.getBalance() - chargeAmount)
		{
			super.withdrawal(amt);
			if(super.getBalance() < minimumBalance)
			{
				super.withdrawal(chargeAmount);
			}
		}
	}
}
