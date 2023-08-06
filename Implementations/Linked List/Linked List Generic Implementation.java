//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class Stack<Item>
{
 	private Node first = null;
 	private class Node
 	{
 		Item item;
 		Node next;
 	}

 	public boolean isEmpty()
 	{ 
	return first == null; 
	}
 	public void push(Item item)
 	{
 	Node oldfirst = first;
 	first = new Node();
 	first.item = item;
 	first.next = oldfirst;
 	}
 	public Item pop()
 	{
 	Item item = first.item;
 	first = first.next;
 	return item;
 	}
}
