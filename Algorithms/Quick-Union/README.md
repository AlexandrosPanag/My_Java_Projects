Quick-Union Algorithm
----

Dynamic connectivity. The input is a sequence of pairs of integers, where each integer represents an object of some type and we are to interpret the pair p q as meaning p is connected to q. We assume that "is connected to" is an equivalence relation:

symmetric: If p is connected to q, then q is connected to p.

transitive: If p is connected to q and q is connected to r, then p is connected to r.

reflexive: p is connected to p.

THIS ARTICLE WAS TAKEN FROM AND CAN BE FOUND HERE - I HIGHLY ENCOURAGE YOU TO READ THE ARTICLE IN ORDER TO FULLY UNDERSTAND HOW THE ALGORITHM WORKS: https://algs4.cs.princeton.edu/15uf/

This is a Java implementation of how the algorithm works.

