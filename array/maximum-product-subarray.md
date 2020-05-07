# Maximum Product Subarray

## Problem

Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

### Example 1

    Input: [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.

### Example 2

    Input: [-2,0,-1]
    Output: 0
    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(1)

```Java
public int maxProduct(int[] nums) {
    int p = nums[0];
    int max_p = p;
    int min_p = p; 
    for(int i = 1; i < nums.length; i++){
        int max_c = Math.max(nums[i], Math.max(nums[i] * max_p, nums[i] * min_p));
        int min_c = Math.min(nums[i], Math.min(nums[i] * max_p, nums[i] * min_p));
        p = Math.max(max_c, p);
        max_p = max_c;
        min_p = min_c;
    }
    return p;
}
```
