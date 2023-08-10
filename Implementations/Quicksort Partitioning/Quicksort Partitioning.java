//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/


private static int quicksort_partition(Comparable[] a, int lo, int hi)
{
    int i = lo, j = hi+1;
    while (true)
    {
    while (less(a[++i], a[lo]))
    if (i == hi) break; //find item on left to swap

    while (less(a[lo], a[--j])) //find item on right to swap
    if (j == lo) break;

    if (i >= j) break; //check if pointers cross
    exch(a, i, j);
    }
 exch(a, lo, j);
 return j; //return index of item now known to be in place
}
