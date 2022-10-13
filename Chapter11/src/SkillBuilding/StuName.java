package SkillBuilding;

import java.io.*;

public class StuName implements Serializable
{
	String fName;
	String lName;
	
	public StuName(String first, String last)
	{
		fName = first;
		lName = last;
	}
	
	public String toString()
	{
		String stuString;
		
		stuString = fName + " " + lName;
		return(stuString);
	}
}
