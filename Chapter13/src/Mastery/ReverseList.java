package Mastery;

import java.util.Stack;
import java.util.Scanner;

public class ReverseList 
{
	public static void main(String[] args) 
	{
		Stack<Integer> data = new Stack<Integer>();
		
		boolean isRunning = true;
		
		while(isRunning)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number (999 to exit)");
			
			int num = input.nextInt();
			
			if(num == 999)
			{
				System.out.println("The list reversed is: ");
				
				for(int i = data.size(); i > 0; i--)
				{
					System.out.print(data.get(i - 1) + ", ");
				}
				isRunning = false;
			}
			else
			{
				data.add(num);
			}
		}
	}

}
