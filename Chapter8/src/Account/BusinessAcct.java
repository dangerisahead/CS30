/*

Program: BusinessAcct.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a business account while using aspects from the Account class, 
adds penalty for having less than the business account limit as a result of withdrawal.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Account;

public class BusinessAcct extends Account
{
	private final int businessMin = 500;
	private final int businessPen = 10;

	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
	}

	public void withdrawal(double amt)
	{
		if (super.getBalance() - amt >= 0)
		{
			if (super.getBalance() >= businessMin)
			{
				super.deposit(-amt);
				if (super.getBalance() < businessMin && super.getBalance() - businessPen > 0)
				{
					super.deposit(-businessPen);
				}
				
				else if (super.getBalance() - businessPen <= 0)
				{
					super.deposit(-super.getBalance());
				}
			}
			
			else
			{
				if (super.getBalance() - (amt + businessPen) > 0)
				{
					super.deposit(-(amt + businessPen));
				}
				
				else if (super.getBalance() - (amt + businessPen) <= 0)
				{
					super.deposit(-super.getBalance());
				}
			}
		}
		
		else
		{
			System.out.println("Not enough money within the account.");
		}	
	}
}
