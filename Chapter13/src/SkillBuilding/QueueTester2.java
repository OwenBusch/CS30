package SkillBuilding;

public class QueueTester2 
{

	static testObject obj = new testObject();
	static testObject obj2 = new testObject();
	static testObject obj3 = new testObject();
	static testObject obj4 = new testObject();
	
	public static void main(String[] args) 
	{
		Queue3 q = new Queue3();
		
		System.out.println("Adding obj and obj2 to the queue");
		q.enqueue(obj2);
		q.enqueue(obj);
		q.enqueue(obj3);
		System.out.println("Front of queue: " + q.front());
		System.out.println("Items in Queue: " + q.size());
		System.out.println("Removing front item.");
		q.Empty();
		System.out.println("adding back obj 1");
		q.enqueue(obj);
		q.enqueue(obj2);
		q.enqueue(obj3);
		q.enqueue(obj4);
		System.out.println("front of queue: " + q.front());
		System.out.println("Items in queue: " + q.size());
		q.Empty();
	}

}
