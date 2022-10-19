
public class WampumBelt 
{
	public static int beltLength = 12;
	
	public static boolean tasslesDrawn = false;

	public static void main(String[] args) 
	{
		Tassles();
		Border();
		Lines();
		Border();
		Triangle();
		Border();
		Square();
		Border();
		Triangle();
		Border();
		Lines();
		Border();
		Tassles();
	}
	
	static void Tassles()
	{
		if(tasslesDrawn)
		{
			for(int i = 0; i < beltLength; i++)
			{
				System.out.print("--");
			}
			
			System.out.println("");
		}
		
		for(int i = 0; i < beltLength; i++)
		{
			System.out.print("| ");
		}
		
		System.out.println("");
		
		for(int i = 0; i < beltLength; i++)
		{
			System.out.print("| ");
		}
		
		System.out.println("");
		
		if(!tasslesDrawn)
		{
			for(int i = 0; i < beltLength; i++)
			{
				System.out.print("--");
			}
		}
		
		System.out.println("");
		
		tasslesDrawn = true;
	}
	
	static void Border()
	{
		int spaceBetween = beltLength - 2;
		System.out.print("||");
		for(int i = 0; i < spaceBetween; i++)
		{
			System.out.print("  ");
		}
		System.out.print("||");
		System.out.println("");
		return;
	}
	
	//Design Methods
	
	static void Triangle()
	{
		System.out.print("||         /\\         ||");
		System.out.println("");
		System.out.print("||        /  \\        ||");
		System.out.println("");
		System.out.print("||       / \\  \\       ||");
		System.out.println("");
		System.out.print("||      /   /  \\      ||");
		System.out.println("");
		System.out.print("||      \\  \\   /      ||");
		System.out.println("");
		System.out.print("||       \\  / /       ||");
		System.out.println("");
		System.out.print("||        \\  /        ||");
		System.out.println("");
		System.out.print("||         \\/         ||");
		System.out.println("");
	}
	
	static void Square()
	{
		System.out.print("|| #################  ||");
		System.out.println("");
		System.out.print("|| #               #  ||");
		System.out.println("");
		System.out.print("|| #      ###      #  ||");
		System.out.println("");
		System.out.print("|| #      #8#      #  ||");
		System.out.println("");
		System.out.print("|| #      ###      #  ||");
		System.out.println("");
		System.out.print("|| #               #  ||");
		System.out.println("");
		System.out.print("|| #################  ||");
		System.out.println("");
	}
	
	static void Lines()
	{
		System.out.print("||--------------------||");
		System.out.println("");
		System.out.print("||--------------------||");
		System.out.println("");
		System.out.print("||                    ||");
		System.out.println("");
		System.out.print("||--------------------||");
		System.out.println("");
		System.out.print("||--------------------||");
		System.out.println("");
		System.out.print("||                    ||");
		System.out.println("");
		System.out.print("||--------------------||");
		System.out.println("");
		System.out.print("||--------------------||");
		System.out.println("");
	}

}
