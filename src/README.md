Author:Shravan.GT
Date:02/01/2025
Java Data Structure

---------------------------------------------------------------------------***************************************************************************

abstract data type:abstraction of a data structure is like process of telling data structure which rules it should adhere to.
ex: in travelling ,transportation is abstraction and mode of transportation is data structure

computational complexity
big-O notation: it usually tells about worst case scenario where input can have worst possibilities.
like O(n),its a linear time and n is input.
if we list it in sorted manner
1)constant time:O(1)
2)Log time:O(log(n))
3)Linear time:O(n)
4)Linearithmic time:O(nlog(n))
5)Quadric time:O(n^2)
6)cubic time:O(n^3)
7)exponential time:O(b^n)
8)factorial time:O(n!)

constant time:loop like while(when simple like i=0 ,i<11) and simple maths eq.
Linear time: loops like  while loop when(i=0,i< n).
quadratic time=when two for loops nested 
ex:for(i=0;i<n;i++) { (j=o;j<n;j++)}here same time for both j=0  and j=i
log time: binery search where we find index of element is sorted array.





to calculate time complexity

if its loop klook into initial,incremental and constraint value
ex: while(i<3*n){
j=10;
while(j<n^3){
j++;
j=0;}
while(j<n){
j+3;
i++}
}
here 3n*((n^3-10)+n/3)=3n^4-3n+n^2 = O(n^4)
ex:finding subsets of set is O(2^n)
finding permutation of string = O(n!)
sorting using mergesort = O(nlog(n))


***************************************************************************


dsa is in two parts

Linear : pre and next elements are connected and stored sequentially and single level
ex:array,list ,stack,queue
Non linear : here are connected non-seq. and diff paths and multi level 
ex: tree,graph 

Asymptotic analysis:To evaluate performance in terms of input size and its increase.
it gives best,avg and worst case.
Omega notation:best case (lower bound or low time in best case)
Big-O notation:worst case(upper bound or low time in worst case)
Theta notation: avg time (both low and upper bound) 

Rules of bigO(O)
->if we get higher order in result then we can lower order finlly(like n^2 and n , consider n^2)
->assignment '=' , return , arithmatic , logical , simple maths take 1 unit time

Arrays:
They are colllection of specified data type.
They hold sequential index or memory locations
fixed size and resize is not possible


stack is LIFO
queue is FIFO

Tree is a non linear data structure that has nodes and not circular 
parent is called root and last node or not connecting node is called leaf(not having children)

binary tree is a tree where each node has 0,1,2 children

binary search tree is  ordered tree which helps in search and insertion of data
-- left sub tree contains node values less than root
-- right sub tree contains node values more than root
-- subtrees must also be binary search tree

complete binary tree has all children or level to be completely filled or at least left side last level is not empty

binary heap is implemented by complete binary tree using array(level-order)
parent-child calculation in binary heap in array index are
- 2k,2k+1 (k is index of array)
- ex: children of 1st index is 2,3(2*1,2*1+1)
- k/2
- ex:parent of 5th index is 2 (5/2)

max-heap:parent should be greater than children
min-heap:parent should be lesser than children