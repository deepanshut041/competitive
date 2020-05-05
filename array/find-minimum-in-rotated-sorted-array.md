# Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

    Example 1:

    Input: [3,4,5,1,2] 
    Output: 1
<br>

    Example 2:

    Input: [4,5,6,7,0,1,2]
    Output: 0

## Binary Search

### Complexity Bn

- Time: O(log(n))
- Space: O(1)

```Java
public int findMin(int[] nums) {
    int l = 0, u = nums.length - 1;
    int m = l + (u - l) /2;
    while(l <= u) {
        m = l + (u - l) /2;
        if(nums[m] < nums[u]) {
            u = m;
        }else if(nums[m] > nums[u]) {
            l = m + 1;
        }else {
            return nums[m];
        }
    }
    return nums[m];
}
```