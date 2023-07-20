The following information was taken from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here:

https://algs4.cs.princeton.edu/home/


Weighted Quick-Union Analysis
----

Running time.
・Find: takes time proportional to depth of p and q.
・Union: takes constant time, given roots.
Proposition. Depth of any node x is at most lg N.

| algorithm | initialize | union | connected |
| --------------- | ---------------- | --------------- |
| quick-find | N | N | 1 |
| quick-union | N | N † | N |
| weighted QU | N lg | N † | lg | N |
