package SkillBuilding;

public class QueueTester 
{

	static testObject obj = new testObject();
	static testObject obj2 = new testObject();
	
	public static void main(String[] args) 
	{
		final int maxItems = 3;
		Queue2 q = new Queue2(maxItems);
		
		System.out.println("Adding obj and obj2 to the queue");
		q.enqueue(obj2);
		q.enqueue(obj);
		System.out.println("Front of queue: " + q.front());
		System.out.println("Items in Queue: " + q.size());
		System.out.println("Removing front item.");
		q.Empty();
		System.out.println("adding back obj 1");
		q.enqueue(obj);
		System.out.println("front of queue: " + q.front());
		System.out.println("Items in queue: " + q.size());
		q.Empty();
	}

}
