//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/



public class Shellsort
{
    public static void sort(Comparable[] a)
    {
    int N = a.length;
    int h = 1;
    while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, ...
    while (h >= 1)
    { // h-sort the array.
    for (int i = h; i < N; i++)
    {
        for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
        exch(a, j, j-h);
    }

    h = h/3;
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