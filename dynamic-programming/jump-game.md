# Jump Game

## Problem

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

### Example 1

    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

### Example 2

    Input: nums = [3,2,1,0,4]
    Output: false
    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

### Constraints

- 1 <= nums.length <= 3 * 10^4
- 0 <= nums[i][j] <= 10^5

## Sub Optimal Solution

### Complexity Suboptimal

- Time: O(n2)
- Space: O(n)

```java
public boolean canJump(int[] nums) {
    if(nums.length == 1) return true;
    if(nums[0] == 0) return false;
    boolean[] dp = new boolean[nums.length]; 
    dp[0] = true;
    for(int i = 0; i < nums.length - 1; i++){
        if(!dp[i]) continue;
        int maxJumps = Math.min(nums.length - 1, i + nums[i]);
        for(int j = i + 1; j <= maxJumps; j++) dp[j] = true;
    }
    return dp[nums.length - 1];
}
```

## Optimal Solution

### Complexity optimal

- Time: O(n)
- Space: O(1)

```java
public boolean canJump(int[] nums) {
    int r = 0;
    for(int i = 0; i < nums.length; i++){
        if(r < i) return false;
        r = Math.max(r, i + nums[i]);
    }
    return true;
}
```
