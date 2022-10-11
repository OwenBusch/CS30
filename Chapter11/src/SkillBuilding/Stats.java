package SkillBuilding;

import java.io.*;

public class Stats 
{

	public static void main(String[] args) 
	{
		File dataFile = new File("..\\Chapter11\\src\\SkillBuilding\\scores.dat");
		FileReader in;
		BufferedReader readFile;
		String names;
		String score;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		try
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			while((names = readFile.readLine()) != null)
			{	
				System.out.println(names);
				readFile.readLine();
			}
			
			while((score = readFile.readLine()) != null)
			{
				System.out.println(score);		
				numScores++;		
				totalScores += Double.parseDouble(score);
			}
			
			avgScore = totalScores / numScores;
			readFile.close();
			in.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}
