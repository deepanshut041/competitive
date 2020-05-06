# Missing Number

## Problem

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

    Example 1:

    Input: [3,0,1]
    Output: 2
<br>

    Example 2:

    Input: [9,6,4,2,3,5,7,0,1]
    Output: 8

### Note

Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(1)

```Java
public int missingNumber(int[] nums) {
    if(nums.length == 0) return 0;
    int s = (nums.length * (nums.length + 1)) / 2;
    for(int i = 0; i < nums.length; i++) s -= nums[i];
    return s;
}
```
