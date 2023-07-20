//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class QuickUnionUF
{
    private int[] id;
    
    public QuickUnionUF(int N)
    {
        id = new int[N];
        for(int i=0; i< N; i++) //set id of each object to itself
            id[i]=i;            // (N array access)
    }
    private int root(int i)
    {
        while(i!=id[i])  //chase parent pointers until reach root
            i=id[i];     // (depth of i array accesses)
    }
    public boolean connected(int p, int q){
        return root(p) == root(q); //check if p and q have the same root
    }                              // depth of p and q array access
    public void union(int p, int q){
    int i = root(p);
    int j = root(q); //change root of p to point to root of q
     if (i == j){ 
         return;
     }
     if (sz[i] < sz[j]) { 
         id[i] = j; sz[j] += sz[i]; 
     }
     else { 
         id[j] = i; sz[i] += sz[j]; 
     } 
    }
}
