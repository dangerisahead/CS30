package Account;
/*

Program: PersonalAcct.java          Last Date of this Revision:  April 1, 2022

Purpose: Defines the basic features of a personal account while using aspects from the Account class, 
adds penalties for having less than the personal account limit as a result of withdrawal.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 
*/

public class PersonalAcct extends Account
{
	private final int personalMin = 100;
	private final int personalPen = 2;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
	}
	
	public void withdrawal(double amt)
	{
		if (super.getBalance() - amt >= 0)
		{
			if (super.getBalance() >= personalMin)
			{
				super.deposit(-amt);
				if (super.getBalance() < personalMin && super.getBalance() - personalPen > 0)
				{
					super.deposit(-personalPen);
				}
				
				else if (super.getBalance() - personalPen <= 0)
				{
					super.deposit(-super.getBalance());
				}
			}
			
			else
			{
				if (super.getBalance() - (amt + personalPen) > 0)
				{
					super.deposit(-(amt + personalPen));
				}
				
				else if (super.getBalance() - (amt + personalPen) <= 0)
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