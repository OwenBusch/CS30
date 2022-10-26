package SkillBuilding;

import java.util.ArrayList;

public class Stack3 
{
	
	ArrayList<Object> data;
	
	public Stack3()
	{
		data = new ArrayList<Object>();
		data.removeAll(data);
	}
	
	public Object top()
	{
		return(data.get(0));
	}
	
	public Object pop()
	{
		data.remove(0);
		return(data.remove(0));
	}
	
	public void push(Object obj)
	{
		data.add(obj);	
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
