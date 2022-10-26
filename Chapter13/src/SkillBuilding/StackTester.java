package SkillBuilding;

public class StackTester 
{

	static testObject obj = new testObject();
	static testObject obj2 = new testObject();
	
	public static void main(String[] args) 
	{
		Stack2 s = new Stack2(3);
		
		System.out.println("Adding obj and obj2 to the stack");
		s.push(obj2);
		s.push(obj);
		System.out.println("Top of stack: " + s.top());
		System.out.println("Items in stack: " + s.size());
		System.out.println("Removing top item.");
		s.makeEmpty();
		System.out.println("adding back obj 1 and new item obj2.");
		s.push(obj);
		System.out.println("Top of stack: " + s.top());
		System.out.println("Items in stack: " + s.size());
		s.makeEmpty();
	}

}
