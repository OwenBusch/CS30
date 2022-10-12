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
		
		double highScore = 0;
		double lowScore = 100;
		
		try
		{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((names = readFile.readLine()) != null) //reads
			{	
				score = readFile.readLine();
				
				System.out.println(names);
				
				System.out.println(score);	
				numScores++;		
					
				if(Double.parseDouble(score) >= highScore)
				{
					highScore = Double.parseDouble(score);
				}
				if(Double.parseDouble(score) <= lowScore)
				{
					lowScore = Double.parseDouble(score);
				}
					
				totalScores += Double.parseDouble(score);
				
			}
						
			System.out.println("Highest score was: " + highScore);
			System.out.println("Lowest score was: " + lowScore);
			
			avgScore = totalScores / numScores;
			
			System.out.println("Class average was: " + avgScore);
			
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
