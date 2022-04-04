/*

Program: CarTest.java          Last Date of this Revision: April 1, 2022

Purpose: Tests the Car, Truck, and Minivan classes.
Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Vehicle;

import java.util.Scanner;

public class CarTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	

		System.out.println("Would you like to create a car ('1'), minivan('2'), or truck ('3')?");
		int choice = input.nextInt();
		
		while (choice != 1 && choice != 2 && choice != 3)
		{
			System.out.println("Enter ('1') to create a car , ('2') for a truck, ('3') for a minivan.");
		    choice = input.nextInt();	
		}
		if (choice == 1)
		{
			System.out.println("How many wheels does the car have?");
	        int wheels = input.nextInt();
		    
		    System.out.println("Is the car self-driveable? Enter '1' if yes, '2' if no");
		    int selfDrive = input.nextInt(); 
		    
		    while (selfDrive != 1 && selfDrive != 2)
		    {
		    	System.out.println("Please enter '1' or '2'!");
		    	selfDrive = input.nextInt();
		    }
		        
		    System.out.println("How fast is the car going (km/h)?");
		    double speed = input.nextDouble();
		 
		    System.out.println("How much does the car weigh (kg)? ");
		    double weight = input.nextDouble();
		   
		    System.out.println("What color is the car?");
		    String color = input.next();
		  
		    System.out.println("What model is the car?");
	        String model = input.next();
	        
	      
	        Car testCar = new Car(wheels, speed, weight, color, model, true);
	        
	        if (selfDrive == 2)
	        {
	            testCar = new Car(wheels, speed, weight, color, model, false);
	        }
	        
		    	    
	        System.out.println("Starting comparison --------------");
		    System.out.println("How many wheels does your neighbors car have?");
	        int wheelsN = input.nextInt();
		        
		    System.out.println("How fast is your neighbors car going (km/h)?");
		    double speedN = input.nextDouble();
		 
		    System.out.println("How much does your neighbors car weigh (kg)? ");
		    double weightN = input.nextDouble();
		   
		    System.out.println("What color is your neighbors car?");
		    String colorN = input.next();
		  
		    System.out.println("What model is your neighbors car?");
	        String modelN = input.next();
	        
	        System.out.println("Is your neighbours car self driveable? ('1') for yes, ('2') for no");
	        int neighbourYOrN= input.nextInt();   
	        
	        while (neighbourYOrN != 1 && neighbourYOrN != 2)
		    {
		    	System.out.println("Please enter '1' or '2'!");
		    	neighbourYOrN = input.nextInt();
		    }
	        
	        Car neighbourCar = new Car(wheelsN, speedN, weightN, colorN, modelN, false);
	        
	        if (neighbourYOrN == 1)
	        {
	        	neighbourCar = new Car(wheelsN, speedN, weightN, colorN, modelN, true);
	        }
	        
	                
	        if (testCar.equals(neighbourCar))
	        {
	        	System.out.println("You and your neighbour have the same car!");
	        }
	        
	        else
	        {
	        	System.out.println("You and your neighbour have different cars...");
	        }
		 
		    System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    	int newChoice = input.nextInt();
	    	
	    	while (newChoice != 1 && newChoice != 2 && newChoice != 3 && newChoice != 4 && newChoice != 5)
	    	{
	    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    		newChoice = input.nextInt();
	    	}
	    	
		    do
		    {
		    	if (newChoice == 1)
		    	{
		    		System.out.println("Deccelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    		testCar.deccelerate(seconds);
		    		System.out.println(testCar.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 2)
		    	{
		    		System.out.println("Accelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    		testCar.accelerate(seconds);
		    		System.out.println(testCar.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 3)
		    	{
		    		
		    		testCar.stop();
		    		System.out.println(testCar.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 4)
		    	{
		    		System.out.println(testCar.honk());
		    		System.out.println(testCar.turn("left"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 5)
		    	{
		    		System.out.println(testCar.honk());
                    System.out.println(testCar.turn("right"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	    	
		    } while (newChoice != 0);
		    
		}
		
		else if (choice == 2)
		{
			System.out.println("How many wheels does the minivan have?");
	        int wheels = input.nextInt();
		        
		    System.out.println("How fast is the minivan going (km/h)?");
		    double speed = input.nextDouble();
		 
		    System.out.println("How much does the minivan weigh (kg)? ");
		    double weight = input.nextDouble();
		   
		    System.out.println("What color is the minivan?");
		    String color = input.next();
		  
		    System.out.println("What model is the minivan?");
	        String model = input.next();
	        
	        System.out.println("How many sliding doors does the minivan have?");
	        int doors = input.nextInt();   
		 
		    Minivan testMini = new Minivan(wheels, speed, weight, color, model, doors);
		    System.out.println(testMini.toString());
		    
		    System.out.println("Starting comparison --------------");
		    System.out.println("How many wheels does your neighbors minivan have?");
	        int wheelsN = input.nextInt();
		        
		    System.out.println("How fast is your neighbors minivan going (km/h)?");
		    double speedN = input.nextDouble();
		 
		    System.out.println("How much does your neighbors minivan weigh (kg)? ");
		    double weightN = input.nextDouble();
		   
		    System.out.println("What color is your neighbors minivan?");
		    String colorN = input.next();
		  
		    System.out.println("What model is your neighbors minivan?");
	        String modelN = input.next();
	        
	        System.out.println("How many sliding doors does your neighbors minivan have?");
	        int doorsN = input.nextInt();   
	        
	        Minivan neighbourMini = new Minivan(wheelsN, speedN, weightN, colorN, modelN, doorsN);
	        
	        if (testMini.equals(neighbourMini))
	        {
	        	System.out.println("You and your neighbour have the same minivan!");
	        }
	        
	        else
	        {
	        	System.out.println("You and your neighbour have different minivans...");
	        }
		 
		    System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    	int newChoice = input.nextInt();	
	    	
	    	while (newChoice != 1 && newChoice != 2 && newChoice != 3 && newChoice != 4 && newChoice != 5)
	    	{
	    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    		newChoice = input.nextInt();
	    	}
	    	
		    do
		    {
		    	if (newChoice == 1)
		    	{
		    		System.out.println("Deccelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    		testMini.deccelerate(seconds);
		    		System.out.println(testMini.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 2)
		    	{
		    		System.out.println("Accelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    		testMini.accelerate(seconds);
		    		System.out.println(testMini.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 3)
		    	{
		    		
		    		testMini.stop();
		    		System.out.println(testMini.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 4)
		    	{
		    		System.out.println(testMini.honk());
		    		System.out.println(testMini.turn("left"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 5)
		    	{
		    		System.out.println(testMini.honk());
                    System.out.println(testMini.turn("right"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	    	
		    } while (newChoice != 0);
		    
		}   
		
		else if (choice == 3)
		{
			System.out.println("How many wheels does the truck have?");
	        int wheels = input.nextInt();
		        
		    System.out.println("How fast is the truck going (km/h)?");
		    double speed = input.nextDouble();
		 
		    System.out.println("How much does the truck weigh (kg)? ");
		    double weight = input.nextDouble();
		   
		    System.out.println("What color is the truck?");
		    String color = input.next();
		  
		    System.out.println("What model is the truck?");
	        String model = input.next();
	        
	        System.out.println("How many axels does your truck have?");
	        int axels = input.nextInt();   
	        
	        System.out.println("What is your trucks fuel efficiency?");
	        double fE = input.nextDouble();
	        
	        System.out.println("How much cargo is your truck carrying?");
	        double cargo = input.nextDouble();
		 
		    Truck testTruck = new Truck(wheels, speed, weight, color, model, cargo, fE, axels);
		    System.out.println(testTruck.toString());
		    
		    System.out.println("Starting comparison --------------");
		    System.out.println("How many wheels does your neighbors truck have?");
	        int wheelsN = input.nextInt();
		        
		    System.out.println("How fast is your neighbors truck going (km/h)?");
		    double speedN = input.nextDouble();
		 
		    System.out.println("How much does your neighbors truck weigh (kg)? ");
		    double weightN = input.nextDouble();
		   
		    System.out.println("What color is your neighbors truck?");
		    String colorN = input.next();
		  
		    System.out.println("What model is your neighbors truck?");
	        String modelN = input.next();
	        
	        System.out.println("How many axels does your neighbours truck have?");
	        int axelsN = input.nextInt();   
	        
	        System.out.println("What is your neighbours trucks fuel efficiency?");
	        double fEN = input.nextDouble();
	        
	        System.out.println("How much cargo is your neighbours truck carrying?");
	        double cargoN = input.nextDouble();
            Truck neighbourTruck = new Truck(wheelsN, speedN, weightN, colorN, modelN, cargoN, fEN, axelsN);
	        
	        if (testTruck.equals(neighbourTruck))
	        {
	        	System.out.println("You and your neighbour have the same truck!");
	        }
	        
	        else
	        {
	        	System.out.println("You and your neighbour have different trucks...");
	        }
		 
		    System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    	int newChoice = input.nextInt();
	    	
	    	while (newChoice != 1 && newChoice != 2 && newChoice != 3 && newChoice != 4 && newChoice != 5)
	    	{
	    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right:");
	    		newChoice = input.nextInt();
	    	}
	    	
		    do
		    {
		    	if (newChoice == 1)
		    	{
		    		System.out.println("Deccelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    		testTruck.deccelerate(seconds);
		    		System.out.println(testTruck.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 2)
		    	{
		    		System.out.println("Accelerate for how many seconds?");
		    		int seconds = input.nextInt();
		    		
		    	    testTruck.accelerate(seconds);
		    		System.out.println(testTruck.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 3)
		    	{
		    		
		    		testTruck.stop();
		    		System.out.println(testTruck.toString());
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 4)
		    	{
		    		System.out.println(testTruck.honk());
		    		System.out.println(testTruck.turn("left"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	
		    	else if (newChoice == 5)
		    	{
		    		System.out.println(testTruck.honk());
                    System.out.println(testTruck.turn("right"));
		    		
		    		System.out.println("Enter ('1') to deccelerate, ('2') to accelerate, ('3') to stop, ('4') to turn left, ('5') to turn right, ('0' to quit):");
		    		newChoice = input.nextInt();
		    	}
		    	    	
		    } while (newChoice != 0);
		}
		
		    
		input.close();	
	}   
}   