//By Alexandros panagiotakopoulos 
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class QuickFindUF{
    private int[] id;
    
    public quickfindUF(int N){
    id = new int[N];
    for(int i=0; i< N; i++)
        id[i]=i; //set id of each object to itself (N array access)
    }
    public boolean connected(int p,int q)
    {
        return id[p]==id[q]; //check whether p and q are in the same 
                             //component (2 array access)
    }
    public void union(int p,int q){ //change all entries with id[p] to id[q]
        int pid=id[p];              //(at most 2N+2 array access)
        int qid=id[q];
        for(int i=0;i<id.length;i++)
            if(id[i]==pid)
                id[i]=qid;
    }
}
