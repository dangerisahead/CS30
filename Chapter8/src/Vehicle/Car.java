/*
Program: Car.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a car while using aspects from the Vehicle class.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30

*/

package Vehicle;

public class Car extends Vehicle
{

	private boolean isSelfDrive;
	
	public Car(int numOfWheels, double kmh, double kilos, String newColor, String newModel, boolean isSelfDrive)
	{
		super(numOfWheels, kmh, kilos, newColor, newModel);
		
	    this.isSelfDrive = isSelfDrive;
	}
	
	public boolean getSelfDrive() 
	{
		return isSelfDrive;
	}

	public void setSelfDrive(boolean selfDrive) 
	{
		this.isSelfDrive = selfDrive;
	}

	public boolean equals(Object c)
	{
		Car object = (Car)c;
		
		if (object.getWheels() ==  super.getWheels() && object.getSpeed() == super.getSpeed() && object.getWeight() == getWeight()
			&& object.getColor() == getColor() && object.getSelfDrive( )== isSelfDrive && object.getModel() == getModel())
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	public String toString()
	{
	    if (isSelfDrive == true)
	    {
	    	String carString = super.toString() + "\nCar is self-driveable.";
	    	return carString;
	    }
		
	    else
	    {
	    	String carString = super.toString() + "\nCar is not self-driveable.";
	    	return carString;
	    }		
	}
	
	@Override
    void stop()
	{
		super.setSpeed(0);
	}
	
	@Override
	void accelerate(int seconds)
	{
		super.setSpeed(super.getSpeed() + (5 * seconds));
	}
	
	@Override
	void deccelerate(int seconds)
	{
		super.setSpeed(super.getSpeed() - (5 * seconds));
	}
	
	@Override
    String turn(String direction)
	{
		String turnString = "Car turned " + direction + ".";
		return turnString;
	}
	
	@Override
    String honk()
	{	
		String honkString = "\nBEEP BEEP!";
		return honkString;
	}
}