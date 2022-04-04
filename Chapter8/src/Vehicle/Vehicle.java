/*

Program: Vehicle.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a vehicle.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package Vehicle;

public abstract class Vehicle
{
	private int wheels;
	private double speed;
	private double weight;
	private String color;
	private String model;
	
	public Vehicle(int numOfWheels, double kmh, double kilos, String newColor, String newModel)
	{
		wheels = numOfWheels;
		speed = kmh;
		weight = kilos;
		color = newColor;
		model = newModel;
	}
	
	public int getWheels() 
	{
		return wheels;
	}
	public void setWheels(int wheels) 
	{
		this.wheels = wheels;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(double kmh)
	{
		this.speed = kmh;
	}
	
	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	/**
	 * @return the color
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * @return the model
	 */
	public String getModel() 
	{
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) 
	{
		this.model = model;
	}

	public String toString()
	{
		String vehicleString = "Wheels: " + wheels + "\nSpeed (km/h): " + speed + "\nWeight (kg): " + weight + "\nColor: " + color
		+ "\nModel: " + model;		
		return vehicleString;
	}
	
	abstract void accelerate(int seconds);
	
	abstract void deccelerate(int seconds);
	
	abstract void stop();
	
	abstract String turn(String direction);
	
	abstract String honk();
}