/*

Program: Circle.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a circle.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30

*/

public class Circle
{
	private static final double pi = 3.14;
	private double r;
	
	public Circle()
	{
		r = 1;
	}
	public Circle(double radius)
	{
		r = radius;
	}
	
	public void setRadius(double input)
	{
		this.r = input;
	}
	
	public double getRadius()
	{
		return r;
	}
	
	public double area()
	{
		return pi * r * r;
	}
	
	public String toString()
	{
		String circleString = "The radius of the circle is: " + r;
		
		return circleString;
	}
	
	public boolean equals(Object c)
	{
		Circle generalObj = (Circle)c;
		
		if (generalObj.getRadius() == getRadius())
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}