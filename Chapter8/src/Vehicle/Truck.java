/*

Program: Truck.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a truck while using aspects from the Vehicle application.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Vehicle;

public class Truck extends Vehicle
{

	private double cargo;
	private double fE;
	private int numAxels;
	
	public Truck(int numOfWheels, double kmh, double kilos, String newColor, String newModel, double cargo, double fE, int numAxels) 
	{
		super(numOfWheels, kmh, kilos, newColor, newModel);
		
		this.cargo = cargo;
		this.fE = fE;
		this.numAxels = numAxels;
	}

	public int getNumOfAxels() 
	{
		return numAxels;
	}

	public void setNumOfAxels(int numOfAxels) 
	{
		this.numAxels = numOfAxels;
	}

	public double getFuelEfficiency() 
	{
		return fE;
	}

	public void setFuelEfficiency(double fuelEfficiency) 
	{
		this.fE = fuelEfficiency;
	}

	public double getCargo() 
	{
		return cargo;
	}

	public void setCargo(double cargo) 
	{
		this.cargo = cargo;
	}

	public String toString()
	{
		String truckString = super.toString() + "\nNum of Axels: " + numAxels + "\nFuel efficiency: " + fE + "\nCurrent cargo: " + cargo;
		return truckString;
	}
	@Override
	void accelerate(int seconds) 
	{
		super.setSpeed(super.getSpeed() + seconds);
	}
	
	@Override
	void deccelerate(int seconds)
	{
		super.setSpeed(super.getSpeed() - seconds);
	}

	@Override
	void stop() 
	{
		super.setSpeed(0);
	}

	@Override
	String turn(String direction) 
	{
	    String turnString = "Truck turned " + direction + ".";
	    return turnString;
	}

	@Override
	String honk() 
	{
	    String honkString = "HONK!";
	    return honkString;
	}
	
}