package SkillBuilding;

public class LinkedList 
{
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void remove(String str)
	{
		Node current = head;
		Node previous = head;
		
		if(current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	public String toString()
	{
		Node current = head;
		String listString;
		
		if(current != null)
		{
			listString = current.getData() + "\n";
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		}
		else
		{
			return("There are no items in the list");
		}
	}
	
	public int size()
	{
		int size = 0;
		for(Node n = head; n.getNext() != null; n = n.getNext())
		{
			size++;
		}
		return(size);
	}
	
	public void addAtEnd(String str)
	{
		Node newNode = new Node(str);
		Node current = head;
		if(head == null)
		{
			newNode.setNext(head);
			head = newNode;
		}
		else
		{
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
		}
		
		current.setNext(newNode);
		
	}
	
	public void makeEmpty() 
	{
		head = null;
	}
}
