//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// This work is based from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here
//https://algs4.cs.princeton.edu/home/

 public static int BinarySearch(int[] a, int key)
 {
 int low = 0, high = a.length-1;
 while (low <= high)
 {
    int mid = low + (high - low) / 2;
        if (key < a[mid]) 
            high = mid - 1;
        else if (key > a[mid]) 
            low = mid + 1;
        else 
            return mid;
    }
 return -1;
 }
