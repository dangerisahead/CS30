/*

Program: Disk.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a disk while using aspects from the Circle class.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

public class Disk extends Circle
{
	private double thickness;
	
	public Disk(double r, double t)
	{
		super(r);
		thickness = t;
	}
	
	public void setThickness(double thick)
	{
		this.thickness = thick;
	}
	
	public double getThickness()
	{
		return thickness;
	}
	
	public double volume()
	{
		double v;	
		v = super.area() * thickness;
		return v;
	}
	
	public boolean equals(Object d)
	{
		Disk testObj = (Disk)d;
		
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness)
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
		String diskString;
		
		diskString = "The disk has a radius of " + super.getRadius()
		+ "and a thickness of " + thickness + ".";
		
		return diskString;
	}
}