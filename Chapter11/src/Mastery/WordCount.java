package Mastery;

import java.io.*;

public class WordCount 
{

	public static void main(String[] args)
	{
		String line;
		int count = 0;
		int numberOfWords = 0;
		double avgWordLength = 0;
		double characters = 0;
		
		File sourceFile = new File("..\\Chapter11\\src\\Mastery\\source.txt");
		FileReader in;
			
		try
		{
			in = new FileReader(sourceFile);
			BufferedReader br = new BufferedReader(in);
			
			while((line = br.readLine()) != null)
			{			
				String words[] = line.split(" ");
				
				for(int i = 0; i < words.length; i++)
				{
					numberOfWords++;
				}
			}
			
			in = new FileReader(sourceFile);
			br = new BufferedReader(in);
			while((line = br.readLine()) != null)
			{
				String[] charWords = line.split("");
				for(int j = 0; j < charWords.length; j++)
				{
					characters++;
				}
				avgWordLength = characters/numberOfWords;
			}
			
			System.out.println("Number of words in the provided .txt file is: " + numberOfWords);
			System.out.println("Average length per word was: " + avgWordLength + " per word.");
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
