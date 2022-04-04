/*

Program: AccountTest.java          Last Date of this Revision: April 1, 2022

Purpose: Tests the BusinessAcct and PersonalAcct applications

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Account;

import java.util.Scanner;

public class AccountTest 
{
	private static final int quit = 0;
	
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("What is your first name?");
	    String fN = input.next();
	    
	    System.out.println("What is your last name?");
	    String lN = input.next();
	    	
	    System.out.println("What street do you live on?");
	    String str = input.next();
	    
	    System.out.println("What city do you live in?");
	    String city = input.next();
	    
	    System.out.println("What province do you live in?");
	    String prov = input.next();
	    
	    System.out.println("What is your zip code?");
	    String zip = input.next();
	    
	    System.out.println("Would you like to create a personal account or business account? ('1' for the former, '2' for the latter)");
	    int choice = input.nextInt();
	    
	    while (choice != 1 && choice != 2)
    	{
    		System.out.println("Please enter '1' to create a personal account or '2' to create a business account.");
    		choice = input.nextInt();
    	}
	    
	    System.out.println("How much money would you like to deposit into your account?");
	    double depo = input.nextDouble();
	    
	    if (choice == 1)
	    {
	    	PersonalAcct person = new PersonalAcct(depo, fN, lN, str, city, prov, zip);
	    	System.out.println("\n" + person.toString());
	    	
	    	System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter)");
	    	int newChoice = input.nextInt();
	    	
	    	while (newChoice != 1 && newChoice != 2)
	    	{
	    		System.out.println("Please enter '1' to withdraw, or '2' to deposit");
	    		newChoice = input.nextInt();
	    	}
	    	
	    	do
	    	{
	    		if (newChoice == 1)
	    		{
	    			
	    			System.out.println("Withdraw an amount: ");
	    			double withdraw = input.nextDouble();
	    			
	    			while (withdraw < 0)
	    			{
	    				System.out.println("You cannot withdraw a negative amount of money. Enter a different amount:");
	    			    withdraw = input.nextDouble();
	    			} 
	    			
	    			person.withdrawal(withdraw);
	    			System.out.println("You have $" + person.getBalance() + " left.");
	    			
	    			System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter, '0' to quit.)");
	    	    	newChoice = input.nextInt();
	    	    	
	    	    	while (newChoice != 1 && newChoice != quit && newChoice != 2)
	    	    	{
	    	    		System.out.println("Please enter '1' to withdraw, '2' to deposit, or '0' to quit.");
	    	    	}
	    		}
	    		
	    		else if (newChoice == 2)
	    		{
	    			System.out.println("Deposit an amount: ");
	    			double newDepo = input.nextDouble();
	    			
	    			while (newDepo < 0)
	    			{
	    				System.out.println("You cannot deposit a negative amount of money. Enter a different amount:");
	    			    newDepo = input.nextDouble();
	    			}
	    			
	    			
	    			person.deposit(newDepo);
	    			System.out.println("You have $" + person.getBalance() + " left.");
	    			
	    			System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter, '0' to quit.)");
	    	    	newChoice = input.nextInt();
	    	    	
	    	    	while (newChoice != 1 && newChoice != quit && newChoice != 2)
	    	    	{
	    	    		System.out.println("Please enter '1' to withdraw, '2' to deposit, or '0' to quit.");
	    	    		newChoice = input.nextInt();
	    	    	}
	    		}
		    	
	    	} while (newChoice != quit);  	
	    }
	    
	    else
	    {
	    	BusinessAcct nosrep = new BusinessAcct(depo, fN, lN, str, city, prov, zip);
	    	System.out.println("\n" + nosrep.toString());
	    	
	    	System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter)");
	    	int newChoice = input.nextInt();
	    	do
	    	{
	    		if (newChoice == 1)
	    		{
	    			System.out.println("Withdraw an amount: ");
	    			double withdraw = input.nextDouble();
	    			
	    			while (withdraw < 0)
	    			{
	    				System.out.println("You cannot withdraw a negative amount of money. Enter a different amount:");
	    			    withdraw = input.nextDouble();
	    			} 
	    			
	    			nosrep.withdrawal(withdraw);
	    			System.out.println("You have $" + nosrep.getBalance() + " left.");
	    			
	    			System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter, '0' to quit.)");
	    	    	newChoice = input.nextInt();
	    	    	
	    	    	while (newChoice != 1 && newChoice != quit && newChoice != 2)
	    	    	{
	    	    		System.out.println("Please enter '1' to withdraw, '2' to deposit, or '0' to quit.");
	    	    		newChoice = input.nextInt();
	    	    	}
	    		}
	    		
	    		else
	    		{
	    			System.out.println("Deposit an amount: ");
	    			double newDepo = input.nextDouble();
	    			
	    			while (newDepo < 0)
	    			{
	    				System.out.println("You cannot deposit a negative amount of money. Enter a different amount:");
	    			    newDepo = input.nextDouble();
	    			} 
	    			
	    			
	    			nosrep.deposit(newDepo);
	    			System.out.println("You have $" + nosrep.getBalance() + " left.");
	    			
	    			System.out.println("Would you like to withdraw or deposit an amount? ('1' for the former, '2' for the latter, '0' to quit.)");
	    	    	newChoice = input.nextInt();
	    	    	
	    	    	while (newChoice != 1 && newChoice != quit && newChoice != 2)
	    	    	{
	    	    		System.out.println("Please enter '1' to withdraw, '2' to deposit, or '0' to quit.");
	    	    		newChoice = input.nextInt();
	    	    	}
	    		}
		    	
	    	} while (newChoice != quit);  	  	
	    }
	    
	    input.close();
	}
}
