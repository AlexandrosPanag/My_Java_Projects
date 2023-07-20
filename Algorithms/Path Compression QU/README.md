The following information was taken from Princeton University, The Book Algorithms 4th Edition which can be found from their official website here:

https://algs4.cs.princeton.edu/home/


Path Compression Quick-Union Analysis
----

Proposition.

[Hopcroft-Ulman, Tarjan] Starting from an
empty data structure, any sequence of M union-find ops
on N objects makes ≤ c ( N + M lg* N ) array accesses.
・Analysis can be improved to N + M α(M, N).
・Simple algorithm with fascinating mathematics.


Linear-time algorithm for M union-find ops on N objects?


・Cost within constant factor of reading in the data.
・In theory, WQUPC is not quite linear.
・In practice, WQUPC is linear.
Amazing fact. [Fredman-Saks] No linear-time algorithm exists.
| Algorithm | Initialize | Union | Connected |
| --------------- | ---------------- | --------------- | --------------- |
| quick-find | N | N | 1 |
| quick-union | N | N † | N |
| weighted QU | N | lg N † | lg N |

| Algorithm | Worst-case time
| --------------- | ---------------- | 
| quick-find | M N |
| quick-union | M N |
| weighted QU | N + M log N |
| QU + path compression | N + M log N |
| Weighted QU + path compression | N + M lg* N |

