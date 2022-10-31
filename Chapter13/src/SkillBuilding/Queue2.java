package SkillBuilding;

public class Queue2 
{
	private Object[] objects;
	private int front, rear, maxSize;
	
	public Queue2(int maxItems)
	{
		objects = new Object[maxItems];
		front = -1;
		rear = -1;
		maxSize = maxItems;
	}
	
	public Object front()
	{
		return(objects[front]);
	}
	
	public Object dequeue()
	{
		front = (front + 1) % maxSize;
		return (objects[front - 1]);
	}
	
	public void enqueue(Object obj)
	{
		if(isEmpty())
		{
			rear = 0;
			front = 0;
			objects[rear] = obj;
		}
		else
		{
			rear = (rear + 1) % maxSize;
			objects[rear] = obj;
		}
	}
	
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public int size()
	{
		if(isEmpty())
		{
			return(0);
		}
		else
		{
			return(rear - front + 1);
		}
	}
	
	public void Empty()
	{
		front = -1;
		rear = -1;
	}
	
}
