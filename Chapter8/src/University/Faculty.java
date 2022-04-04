/*

Program: Faculty.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a faculty member using aspects from the UEmployee class.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package University;

public class Faculty extends UEmployee
{
    private String depName;

	public Faculty(double money, String fn, String ln, String fac) 
	{
		super(money, fn, ln);
		depName = fac;
	}

	public String getDepName() 
	{
		return depName;
	}

	public void setDepName(String department) 
	{
		this.depName = department;
	}
	
	public String toString()
	{
		
	    String facString = super.toString();
	    facString += ("\nDepartment: " + depName);
	    return facString;
	}
}


