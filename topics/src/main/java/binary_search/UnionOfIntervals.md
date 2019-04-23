Given a list of integers, find the n-th smallest number, i.e., the number that appears at index n (0-based) when they are sorted in non-descending order. The numbers will be given in intervals. For example, the intervals (1, 3) and (5, 7) represent the list of numbers { 1, 2, 3, 5, 6, 7 }. A number may be present in more than one interval, and it appears in the list once for each interval it is in. For example, the intervals (1, 4) and (3, 5) represent the list of numbers { 1, 2, 3, 3, 4, 4, 5 }.

The intervals will be given as two int[]s, lowerBound and upperBound. The i-th elements of these int[]s represent the smallest and largest numbers in the i-th interval, inclusive.

 
Definition
    	
Class:	UnionOfIntervals
Method:	nthElement
Parameters:	int[], int[], int
Returns:	int
Method signature:	int nthElement(int[] lowerBound, int[] upperBound, int n)
(be sure your method is public)
    
 
Notes
-	n is 0-based, meaning that the first element is indexed 0.
-	A sequence is sorted in non-descending order if and only if for each pair of indices i and j, where i is smaller than j, the element at position i is less than or equal to the element at position j.
 
Constraints
-	lowerBound will contain between 1 and 50 elements, inclusive.
-	upperBound will contain the same number of elements as lowerBound.
-	Each element of lowerBound and upperBound will be between -2,000,000,000 and 2,000,000,000, inclusive.
-	The i-th element of lowerBound will be less than or equal to the i-th element of upperBound.
-	n will be a non-negative integer less than the total number of elements in the list, but no greater than 2,000,000,000.
 
Examples
0)	
    	
{ 1, 5 }
{ 3, 7 }
4
Returns: 6
The numbers are 1, 2, 3, 5, 6 and 7. The number at index 4 is 6.
1)	
    	
{ 1, 3 }
{ 4, 5 }
3
Returns: 3
2)	
    	
{ -1500000000 }
{ 1500000000 }
1500000091
Returns: 91
Watch out for overflow errors.
