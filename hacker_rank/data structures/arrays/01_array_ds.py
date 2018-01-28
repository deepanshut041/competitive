import sys

"""
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

Sample Input
4
1 4 3 2

Sample Output
2 3 4 1
"""
n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

if n != len(arr):
    print("Array out of range")
else:
    for i in range(0,int(len(arr)/2)):
        temp = arr[i]
        arr[i] = arr[len(arr) - i - 1]
        arr[len(arr) - i - 1] = temp
for i in arr:
    print(i, end=" ")