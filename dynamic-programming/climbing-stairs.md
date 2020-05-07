# Climbing Stairs

## Problem

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

### Example 1

    Input: 2
    Output: 2
    Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps

### Example 2

    Input: 3
    Output: 3
    Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(n)

```Java
public int climbStairs(int n) {
    if(n == 1) return 1;
    int[] m = new int[n + 1];
    m[1] = 1;
    m[2] = 2;
    for(int i = 3; i <= n; i++){
        m[i] = m[i - 1] + m[i - 2];
    }
    return m[n];
}
```
