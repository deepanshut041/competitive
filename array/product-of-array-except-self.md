# Product of Array Except Self

## Problem

Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

### Example

    Input:  [1,2,3,4]
    Output: [24,12,8,6]

### Constraint

It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

### Note

Please solve it without division and in O(n).

### Follow up

Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

## With Divison

### Complexity With Divison

- Time: O(n)
- Space: O(n)

```java
public int[] productExceptSelf(int[] nums) {
    int[] p = new int[nums.length];
    int tp = 1;
    int z = 0;
    for (int num: nums){
        if(num != 0) tp *= num;
        else z++;
    }
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != 0){
            if(z > 0) p[i] = 0;
            else p[i] = tp / nums[i];
        } else{
            if(z > 1) p[i] = 0;
            else p[i] = tp;
        }
    }
    return p;
}
```

## Without Divison

### Complexity Without Divison

- Time: O(n)
- Space: O(n)

```java
public int[] productExceptSelf(int[] nums) {
    int[] p = new int[nums.length];
    p[0] = 1;
    for(int i = 1; i < nums.length; i++)
        p[i] = p[i-1] * nums[i-1];
    int rp = 1;
    for(int i = nums.length - 1; i > -1; i--){
        p[i] = p[i] * rp;
        rp *= nums[i];
    }
    return p;
}
```
