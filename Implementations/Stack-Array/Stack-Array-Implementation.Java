//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class StackArrayImplementation{
	private String[] s;
        private int N = 0;
        
        public FixedCapacityStackOfStrings(int capacity){
            s = new String[capacity];
        }

        public boolean isEmpty(){
            return N == 0;
        }

        public void push(String Item){
        s[N++] = item;
        }

        public String pop(){
        return s[--N];
        }
}