package SkillBuilding;

import java.util.ArrayList;

public class Queue3 
{
	ArrayList<Object> objects;
	
	
	public Queue3()
	{
		objects = new ArrayList<Object>();
		objects.removeAll(objects);
	}
	
	public Object front()
	{
		return(objects.get(0));
	}
	
	public Object dequeue()
	{
		objects.remove(0);
		return (objects.remove(0));
	}
	
	public void enqueue(Object obj)
	{
		objects.add(obj);
	}
	
	public boolean isEmpty()
	{
		if(objects.isEmpty())
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
			return(objects.size());
		}
	}
	
	public void Empty()
	{
		objects.removeAll(objects);
	}
	
}
