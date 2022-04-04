/*

Program: Puck.java          Last Date of this Revision: September 30, 2019

Purpose: Defines the basic features of a puck using aspects from the Disk class.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

public class Puck extends Disk
{
	private double weight;
	private boolean standard;
	private boolean youth;
	
	public Puck(double ounces, double r, double t)
	{
		super(r,t);
		
		weight = ounces;
		standard = false;
		youth = false;
		
		if (weight <= 5.5 && weight >= 5)
		{
		    setStandard(true);
		}
		
		
		if (weight <= 4.5 && weight >= 4)
		{
	        setYouth(true);
		}	
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double input)
	{
		this.weight = input;
	}
	
    public boolean getStandard() 
    {
		return standard;
	}

	private void setStandard(boolean stand) 
	{
		this.standard = stand;
	}

	public boolean getYouth() 
	{
		return youth;
	}
	
	private void setYouth(boolean young) 
	{
		this.youth = young;
	}

	private String getDivision()
    {
    	if (standard == true)
    	{
    		return ("\nPuck is suitable for standard division.");
    	}
    	
    	else if (youth == true)
    	{
    		return ("\nPuck is suitable for youth division");
    	}
    	
    	else
    	{
    		return ("\nPuck is not suitable for either division.");
    	}
    }
    
    public boolean equals(Object p1)
    {
    	Puck object = (Puck)p1;
    	
    	if (object.getWeight() == weight && object.getThickness() == super.getThickness()
    		&& object.getRadius() == super.getRadius())
    	{
    		return true;
    	}
    	
    	else
    	{
    		return false;
    	}
    }
	
    public double compareTo(Object p)
    {
    	Puck object = (Puck)p;
    	
    	if (object.getWeight() > weight)
    	{
    		return(-1);
    	}
    	
    	else if (object.getWeight() == weight)
    	{
    		return(0);
    	}
    	
    	else
    	{
    		return (1);
    	}
    }
	public String toString()
	{
		String puckString = "Puck weight (ounces): " + weight + getDivision()
		+ "\nPuck radius (cm): " + super.getRadius() + "\nPuck thickness (cm): " + super.getThickness()
		+ "\nPuck volume (cm^3): " + super.volume() + "\nPuck area (cm^2): " + super.area();
		
		return puckString;
	}
	
	/* Screen Dump
	 * Enter the weight of the puck (ounces):
      12
      Enter the puck's radius (cm):
      14
      Enter the puck's thickness (cm):
      13
      Puck weight (ounces): 12.0
      Puck is not suitable for either division.
      Puck radius (cm): 14.0
      Puck thickness (cm): 13.0
      Puck volume (cm^3): 8000.720000000001
      Puck area (cm^2): 615.44
      Name the first puck:
      Anthony
      Enter the weight of the first puck (ounces):
      12
      Enter the first puck's radius (cm):
      13
      Enter the first puck's thickness (cm):
      14
      Name the second puck:
      Anidu
      Enter the weight of the second puck (ounces):
      12
      Enter the second puck's radius (cm):
      15
      Enter the second puck's thickness (cm):
      13
      
      Anthony and Anidu aren't equal.

      Anthony and Anidu are the same weight.
	 */
}