# Container With Most Water

## Problem

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

### Note

You may not slant the container and n is at least 2.

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

### Example

    Input: [1,8,6,2,5,4,8,3,7]
    Output: 49

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(1)

```java
public int maxArea(int[] h) {
    int m = 0;
    int l = 0, r = h.length - 1;
    while(l < r){
        int cm = Math.min(h[l], h[r]) * (r-l);
        m = Math.max(cm, m);
        if(h[l] > h[r]) r--;
        else l++;
    }
    return m;
}
```
