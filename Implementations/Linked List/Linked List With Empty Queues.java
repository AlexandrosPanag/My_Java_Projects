//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class LinkedQueueOfStrings
{
    private Node first, last;

    private class Node
    { String item;
      Node next; 
    }

 public boolean isEmpty()
 { 
    return first == null; 
 }

 public void enqueue(String item)
 {
    Node oldlast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) first = last;
    else oldlast.next = last;
    }

 public String dequeue()
 {
    String item = first.item;
    first = first.next;
    if (isEmpty()) last = null;
    return item;
 }
}