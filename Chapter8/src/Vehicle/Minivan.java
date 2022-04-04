/*

Program: Minivan.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a minivan while using aspects from the Vehicle application.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Vehicle;

public class Minivan extends Vehicle
{
	private int slidingDoors;
	
	public Minivan(int numOfWheels, double kmh, double kilos, String newColor, String newModel, int slidingDoors)
	{
		super(numOfWheels, kmh, kilos, newColor, newModel);
		
		this.slidingDoors = slidingDoors;
	}

	public int getSlidingDoors() 
	{
		return slidingDoors;
	}

	public void setSlidingDoors(int slidingDoors) 
	{
		this.slidingDoors = slidingDoors;
	}
	
	public boolean equals(Object m)
	{
        Minivan object = (Minivan)m;
		
		if (object.getWheels() ==  super.getWheels() && object.getSpeed() == super.getSpeed() && object.getWeight() == super.getWeight()
			&& object.getColor() == super.getColor() && object.getSlidingDoors( )== slidingDoors && object.getModel() == super.getModel())
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
		String miniString = super.toString() + "\n# of sliding doors: " + slidingDoors;
		return miniString;
	}

	@Override
    void stop()
	{
		super.setSpeed(0);
	}
	
	@Override
	void accelerate(int seconds)
	{
		super.setSpeed(super.getSpeed() + (3 * seconds)) ;
	}
	
	@Override
	void deccelerate(int seconds)
	{
		super.setSpeed(super.getSpeed() - (3 * seconds));
	}
	
	@Override
    String turn(String direction)
	{
		String turnString = "Minivan turned " + direction + ".";
		return turnString;
	}
	
	@Override
    String honk()
	{	
		String honkString = "Beep!\n";
		return honkString;
	}
	
	
}