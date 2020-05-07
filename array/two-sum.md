# Two Sum

## Problem

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

### Example

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].

## Brute Force Solution(Accepted)

In this approach solution was to iterate like bubble sort and try to solve the problem by Brue Force. 

### Complexity Brute Force

- Time: O(n2)
- Space: O(1)

```java
public int[] twoSum(int[] nums, int target) {
    for(int i=0; i < nums.length - 1; i++ ){
        for(int j=i+1; j < nums.length; j++){
            if(nums[i] + nums[j] == target){
                int[] result = {i, j};
                return result;
            }
        }
    }
    return null;
}
```

## HashMap Solution

In this approach the solution was to solve the problem using HashMap. Search is O(1) which reduces complexity.

### Complexity HashMap

- Time: O(n)
- Space: O(n)

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        map.put(nums[i], i);
    }
    for(int i = 0; i < nums.length; i++ ){
        int c = target - nums[i];
        if(map.containsKey(c) && map.get(c) != i ){
            return new int[] {i, map.get(c)};
        }
    }
    return null;
}
```
