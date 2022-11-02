package Mastery;

import java.util.Stack;
import java.util.Scanner;

public class Stats 
{
	static int num;
	static int sum = 0;
	static int min = 100;
	static int max = 0;
	static int minNum;
	static int maxNum;
	
	public static void main(String[] args) 
	{
		Stack<Integer> data = new Stack<Integer>();
		
		boolean isRunning = true;

		
		while(isRunning)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number (999 to exit)");
			
			num = input.nextInt();
			
			if(num == 999)
			{	
				System.out.println("The items in the stack are: ");
				
				for(int i = 0; i < data.size(); i++)
				{
					System.out.print(data.get(i) + ", ");
				}
				
				System.out.println("\nThe sum of all the items in the stack is: " + addToSum());
				System.out.println("The smallest number in the stack is: " + minNum);
				System.out.println("The biggest number in the stack is: " + maxNum);
				
				isRunning = false;
			}
			else
			{
				data.add(num);
				addToSum();
				findMin(num);
				findMax(num);
			}
		}
	}
	
	public static int addToSum()
	{
		sum += num;
		return(sum - 999);
	}
	
	public static void findMin(int testNum)
	{
		if(testNum < min)
		{
			min = testNum;
		}
		
		minNum = min;
	}
	
	public static void findMax(int testNum)
	{
		if(testNum > max)
		{
			max = testNum;
		}
		
		maxNum = max;
	}

}
