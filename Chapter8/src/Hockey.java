/*

Program: Hockey.java          Last Date of this Revision: April 1, 2022

Purpose: Tests the functionality of the Puck class.

Author: Anthony Anidu AKA best teenage programmer
School: CHHS
Course: Computer Programming 30
 
*/

import java.util.Scanner;
public class Hockey 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of the puck (ounces):");
		double weight = input.nextDouble();
		
		System.out.println("Enter the puck's radius (cm):");
		double radius = input.nextDouble();
		
		System.out.println("Enter the puck's thickness (cm):");
		double thick =  input.nextDouble();
		
		Puck puck = new Puck(weight, radius, thick);
		
		System.out.println(puck.toString());
		
		System.out.println("Name the first puck:");
		String firstPuckName = input.next();
		
		System.out.println("Enter the weight of the first puck (ounces):");
		double weightPuckOne = input.nextDouble();
		
		System.out.println("Enter the first puck's radius (cm):");
		double radiusPuckOne = input.nextDouble();
		
		System.out.println("Enter the first puck's thickness (cm):");
		double thickPuckOne =  input.nextDouble();
		
		System.out.println("Name the second puck:");
		String secondPuckName = input.next();
		
		System.out.println("Enter the weight of the second puck (ounces):");
		double weightPuckTwo = input.nextDouble();
		
		System.out.println("Enter the second puck's radius (cm):");
		double radiusPuckTwo = input.nextDouble();
		
		System.out.println("Enter the second puck's thickness (cm):");
		double thickPuckTwo =  input.nextDouble();
		
		Puck puckOne = new Puck(weightPuckOne, radiusPuckOne, thickPuckOne);
		Puck puckTwo = new Puck(weightPuckTwo, radiusPuckTwo, thickPuckTwo);
		
		if (puckOne.equals(puckTwo))
		{
			System.out.println(firstPuckName + " and " + secondPuckName + " are equal.\n");
		}
		
		else
		{
			System.out.println(firstPuckName + " and " + secondPuckName + " aren't equal.\n");
		}
		
		if (puckOne.compareTo(puckTwo) == -1)
		{
			System.out.println(firstPuckName + " is lighter than " + secondPuckName);
		}
		
		else if (puckOne.compareTo(puckTwo) == 0)
		{
			System.out.println(firstPuckName + " and " + secondPuckName + " are the same weight.");
		}
		
		else
		{
			System.out.println(firstPuckName + " is heavier than " + secondPuckName);
		}
		
		input.close();
	}
}