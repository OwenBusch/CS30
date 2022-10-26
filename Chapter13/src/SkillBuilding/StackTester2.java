package SkillBuilding;

public class StackTester2 
{

	static testObject obj1 = new testObject();
	static testObject obj2 = new testObject();
	static testObject obj3 = new testObject();
	static testObject obj4 = new testObject();
	static testObject obj5 = new testObject();
	static testObject obj6 = new testObject();
	
	public static void main(String[] args) 
	{
		Stack3 s = new Stack3();
		
		System.out.println("Adding a few objects to the stack");
		s.push(obj2);
		s.push(obj1);
		s.push(obj4);
		s.push(obj6);
		System.out.println("Top of stack: " + s.top().toString());
		System.out.println("Items in stack: " + s.size());
		System.out.println("Removing top item.");
		s.makeEmpty();
		System.out.println("adding back obj 1 and new item obj2.");
		s.push(obj6);
		//System.out.println(obj6);
		System.out.println("Method on top stack returned: " + s.top());
		System.out.println("Items in stack: " + s.size());
		s.makeEmpty();
	}

}
