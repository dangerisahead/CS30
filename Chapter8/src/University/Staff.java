/*

Program: Staff.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a staff member using aspects of the UEmployee class.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package University;

public class Staff extends UEmployee 
{
	private String job;

	public Staff(double money, String fn, String ln, String title) 
	{
		super(money, fn, ln);
		job = title;
	}

	public String getJob() 
	{
		return job;
	}

	public void setJob(String profession) 
	{
		this.job = profession;
	}
	
	public String toString()
	{
		String staffString = super.toString();
		staffString += ("\nJob title: " + job);
		return staffString;
	}

}