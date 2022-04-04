/*

Program: UEmployee.java          Last Date of this Revision: April 1, 2022

Purpose: Defines the basic features of a university employee.

Author: Anthony Anidu
School: CHHS
Course: Computer Programming 30
 
*/

package University;

import java.text.NumberFormat;

public class UEmployee 
{
    private String firstName;
    private String lastName;
    private double pay;
    
    public UEmployee(double money, String fn, String ln)//Constructor method
    {
    	firstName = fn;
    	lastName = ln;
    	pay = money;
    }
    
    public void setFn(String name)
    {
    	this.firstName = name;
    }
    
    public String getFn()
    {
    	return firstName;
    }
    
    public void setLn(String name)
    {
    	this.lastName = name;
    }
    
    public String getLn()
    {
    	return lastName;
    }
    
    
    public double getPay()
    {
    	return pay;
    }
    
    public void setPay(double amount)
    {
    	this.pay = amount;
    }
    public String toString()
    {
    	NumberFormat money = NumberFormat.getCurrencyInstance();
    	String empString = (firstName + " " + lastName + "\nSalary: " + money.format(pay));
    	return empString;
    }
    
}
