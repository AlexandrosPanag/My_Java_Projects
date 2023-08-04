//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class StackArrayImplementation{
	private String[] s;
        private int N = 0;
        
        public FixedCapacityStackOfStrings(int capacity){
            s = new String[capacity];
        }

        public boolean isEmpty(){ //check if empty
            return N == 0;
        }

        public void push(String Item){ //used to index into array: then increment N
        s[N++] = item;
        }

        public String pop(){ //used to index into array: then decrement N
        return s[--N];
        }
}
