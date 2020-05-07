# Search in Rotated Sorted Array

## Problem

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

### Example 1

    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4

### Example 2

    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1

## Optimal Solution

### Complexity

- Time: O(log(n))
- Space: O(1)

```java
public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1;
    while(l <= r) {
        int m = l + (r - l) /2;
        if(nums[m] == target) return m;
        if(nums[m] < nums[l]){
            if(nums[m] < target && nums[r] >= target) l = m + 1;
            else r = m - 1;
        } else {
            if(nums[m] > target && nums[l] <= target) r = m - 1;
            else l = m + 1;
        }
    }
    return -1;  
}
```
