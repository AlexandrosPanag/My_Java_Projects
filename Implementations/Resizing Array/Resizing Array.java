//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public ResizingArrayStackOfStrings(){
στ	s = new String[1];
}

public void push(String item){
    if(N == s.length)resize(2*s.length);
    s[N++] = item;
}

private void resize(int capacity){
    String[] copy = new String[capacity];
    for(int i=0; i<N; i++)
        copy[i] = s[i];
    s = copy;
}
