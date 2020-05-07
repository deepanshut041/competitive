# Longest Increasing Subsequence

## Problem

Given an unsorted array of integers, find the length of longest increasing subsequence.

    Example:

    Input: [10,9,2,5,3,7,101,18]
    Output: 4 
    Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 

### Note

- There may be more than one LIS combination, it is only necessary for you to return the length.
- Your algorithm should run in O(n2) complexity.

### Follow up

Could you improve it to O(n log n) time complexity?

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(n)

```Java
public int lengthOfLIS(int[] nums) {
    if(nums.length == 0) return 0;
    if(nums.length == 1) return 1;
    int[] dp = new int[nums.length];
    int ls = 1;
    dp[nums.length - 1] = 1;
    for(int i = nums.length -2; i >= 0; i--){
        int s = 1;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] < nums[j]) s = Math.max(s, dp[j] + 1);
        }
        dp[i] = s;
        ls = Math.max(ls, s);
    }
    return ls;
}
```
