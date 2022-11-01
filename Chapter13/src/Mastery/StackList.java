package Mastery;

import java.util.LinkedList;

public class StackList 
{
	LinkedList<Object> data;
	
	public StackList()
	{
		data = new LinkedList();
		data.removeAll(data);
	}
	
	public Object top()
	{
		data.getFirst();
		return(data.getFirst());
	}
	
	public Object pop()
	{
		data.remove(data.getFirst());
		return(data.remove(data.getFirst()));
	}
	
	public void push(Object obj)
	{
		data.addFirst(obj);
	}
	
	public boolean isEmpty()
	{
		if(data.size() == 0)
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
