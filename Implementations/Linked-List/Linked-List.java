public class LinkedStackofStrings{
	private Node first = null;
        private class Node //private inner class (access modifiers don't matter
        {
            String item;
            Node next;
        }
        
        public boolean isEmpty() //check if the list is empty
        {
            return first == null;
        }
        public void push(String item)
        {
            Node oldfirst = first;
            first.item = item;
            first.next = oldfirst;
        }
        public String pop(){
        String item = first.item;
        first = first.next;
        return item;
        }
}