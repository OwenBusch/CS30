package SkillBuilding;

import java.io.*;
import java.util.Scanner;

public class Roster 
{
	public static void main(String[] args) 
	{
		String fileName = "";
		
		int students = 0;
		
		try
		{
			Scanner input = new Scanner(System.in);
			
			//WRITE OBJECTS
			
			System.out.println("Enter the name of the file you want to write to: ");
			fileName = input.next();
			
			File rosterFile = new File("..\\Chapter11\\src\\SkillBuilding\\" + fileName);
			
			System.out.println("Enter how many students will be on the roster: ");
			students = input.nextInt();
			
			FileOutputStream out = new FileOutputStream(rosterFile);
			ObjectOutputStream writeRost = new ObjectOutputStream(out);
			
			for(int i = 0; i < students; i++)
			{				
				System.out.println("Enter the first name of the student: ");
				String fName = input.next();
				System.out.println("Enter the last name of the student: ");
				String lName = input.next();
				
				writeRost.writeObject(new StuName(fName, lName));				
			}	
			
			writeRost.close();
			System.out.println("Data written to file");
			
			//READ OBJECTS
			
			FileInputStream in = new FileInputStream(rosterFile);
			ObjectInputStream readRost = new ObjectInputStream(in);
			
			System.out.println("\nThe current class roster is: ");
			
			for(int i = 0; i < students; i++)
			{
				StuName student = (StuName)readRost.readObject();
								
				System.out.println(student);
			}
			readRost.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		} catch (ClassNotFoundException e) 
		{
			System.out.println("Class could not be found to cast object");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
	}
}
