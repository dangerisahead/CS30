/*

Program: UniTest.java          Last Date of this Revision: April 1, 2022

Purpose: Tests the Faculty and Staff classes.

Author: Anthony Anidu 
School: CHHS
Course: Computer Programming 30
 
*/

package University;

import java.util.Scanner;

public class UniTest 
{
    public static void main (String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println(("Enter your yearly salary:"));
    	double sal = input.nextDouble();
    	
    	System.out.println("Enter your first name:");
    	String fN = input.next();
    	
    	System.out.println("Enter your last name:");
    	String lN = input.next();
    	
    	System.out.println("Are you faculty or staff? ('1' for the former, '2' for  the latter)");
    	int choice = input.nextInt();
    	
    	while (choice != 1 && choice != 2)
    	{
    		System.out.println("Are you faculty or staff? ('1' for the former, '2' for  the latter)");
            choice = input.nextInt();
    	}
    	
    	if (choice == 1)
    	{
    		System.out.println("Enter the name of your department:");
    		String depName = input.next();
    		
    		Faculty fac =  new Faculty(sal, fN, lN, depName);
    		System.out.println(fac.toString());
    	}
    	
    	else
    	{
    		System.out.println("Enter your job title:");
    		String job = input.next();
    		
    		Staff newStaff =  new Staff(sal, fN, lN, job);
    		System.out.println(newStaff.toString());
    	}
    	
    	input.close();
    }
}