package Mastery;

public class BusinessAcct extends Account
{
	//public static Account businessAcct = new Account(1000, "Owen", "Busch", "227 Covepark Place NE", "Calgary", "AB", "T3K 5Z8");
	
	public static double minimumBalance = 500;
	
	public static double chargeAmount = 10;
	
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
	{
		//balance = bal;
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
