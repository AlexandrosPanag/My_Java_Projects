//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/


public class SelectionSort
{
    public static void sort(Comparable[] a)
    {
    int N = a.length;
    for (int i = 0; i < N; i++)
    {
    int min = i;
    for (int j = i+1; j < N; j++)
    if (less(a[j], a[min]))
    min = j;
    exch(a, i, min);
    }
 }
    /*
    Helper functions. Refer to data through compares and exchanges.
    Less. Is item v less than w ?
    */
    
    private static boolean less(Comparable v, Comparable w)
    { 
        return v.compareTo(w) < 0;
    }
    
    /*
    Exchange. Swap item in array a[] at index i with the one at index j.
    */
    
    private static void exch(Comparable[] a, int i, int j)
    { Comparable swap = a[i];
      a[i] = a[j];
      a[j] = swap; 
    }
    
}
