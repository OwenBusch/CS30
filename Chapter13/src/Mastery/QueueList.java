package Mastery;

import java.util.LinkedList;

public class QueueList 
{
	LinkedList<Object> data;
	
	public QueueList()
	{
		data = new LinkedList<Object>();
		data.removeAll(data);
	}
	
	public Object front()
	{
		return(data.getFirst());
	}
	
	public Object dequeue()
	{
		data.remove(data.getLast());
		return(data.remove(data.getLast()));
	}
	
	public void enqueue(Object obj)
	{
		data.add(obj);
	}
	
	public boolean isEmpty()
	{
		if(data.isEmpty())
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
			return(data.size());
		}
	}
	
	public void makeEmpty()
	{
		data.removeAll(data);
	}
}
