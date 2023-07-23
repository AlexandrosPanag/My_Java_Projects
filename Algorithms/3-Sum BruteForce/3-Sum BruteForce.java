//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

public class ThreeSum
{
    public static int count(int[] a)
            int N = a.length;
            int count= 0;
            for(int i=0; i< N; i++)
                for(int j=i+1; j<N; j++)
                    for(int k = j+1; k<N; k++) //check for each triple
                        if(a[i]+a[j]+a[k]==0) //for simplicity ignore integer overflow
                        count++;
            return count;

public static void main(String[] args){
    int[] a = in.readInts(args[0]);
    StdOut.println(count(a));
    }
}