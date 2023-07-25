Binary search: mathematical analysis
-------------


Proposition. Binary search uses at most 1 + lg N key compares to search in
a sorted array of size N.
Def. T (N) ≡ # key compares to binary search a sorted subarray of size ≤ N.
Binary search recurrence. T (N) ≤ T (N / 2) + 1 for N > 1, with T (1) = 1.
