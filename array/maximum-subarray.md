# Maximum Subarray

## Problem

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

### Follow up

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

## Kadane's Algorithm

https://www.youtube.com/watch?v=86CQq3pKSUw

### Complexity Kadanes's Algo

- Time: O(n)
- Space: O(1)

```Java
public int maxSubArray(int[] nums) {
    int s = nums[0];
    int cs = s;
    for(int i = 1; i < nums.length; i++){
        cs = Math.max(nums[i], nums[i]+cs);
        s = Math.max(cs, s);
    }
    return s;
}
```
