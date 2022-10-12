package SkillBuilding;

import java.io.*;
import java.util.Scanner;

public class Stats2 
{

	public static void main(String[] args) 
	{
		File dataFile = new File("..\\Chapter11\\src\\SkillBuilding\\stats.dat");
		dataFile.deleteOnExit();
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		double score;
		String name;
		int students;
		
		double lowScore = 100;
		double highScore = 0;
		
		double avgScore = 0;
		
		double totalMark = 0;
		
		try
		{
			if(dataFile.exists())
			{
				System.out.print("Enter how many students are in the class: ");
				students = input.nextInt();
				out = new FileWriter(dataFile);
				writeFile = new BufferedWriter(out);
				for(int i = 0; i < students; i++)
				{
					System.out.println("Enter Student Name: ");
					name = input.next();
					System.out.println("Enter " + name + "'s test score");
					score = input.nextDouble();
					writeFile.write(name);
					writeFile.newLine();
					writeFile.write(String.valueOf(score));
					writeFile.newLine();
					
					if(score >= highScore)
					{
						highScore = score;
					}
					if(score <= lowScore)
					{
						lowScore = score;
					}
					
					totalMark += score;
					
					avgScore = totalMark / students;
				}
				
				System.out.println("The lowest score in the class was: " + lowScore);
				System.out.println("The highest score in the class was: " + highScore);
				System.out.println("The class average was: " + avgScore);
			}
			else 
			{
				dataFile.createNewFile();
				out = new FileWriter(dataFile);
				writeFile = new BufferedWriter(out);
				
				System.out.print("Enter how many students are in the class: ");
				students = input.nextInt();
				
				for(int i = 0; i < students; i++)
				{
					System.out.println("Enter Student Name: ");
					name = input.next();
					System.out.println("Enter " + name + "'s test score");
					score = input.nextDouble();
					writeFile.write(name);
					writeFile.newLine();
					writeFile.write(String.valueOf(score));
					writeFile.newLine();
					
					if(score >= highScore)
					{
						highScore = score;
					}
					if(score <= lowScore)
					{
						lowScore = score;
					}
					
					avgScore = (avgScore += score) / students;
				}
				
				System.out.println("The lowest score in the class was: " + lowScore);
				System.out.println("The highest score in the class was: " + highScore);
				System.out.println("The class average was: " + avgScore);
			}
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
		}
	}	
}
