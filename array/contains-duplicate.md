# Contains Duplicate

## Problem

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true
<br>

    Example 2:

    Input: [1,2,3,4]
    Output: false
<br>

    Example 3:

    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true

## Hashmap solution

### Complexity Hashmap

- Time: O(n)
- Space: O(2n)

```Java

public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])) return true;
        map.put(nums[i], i);
    }
    return false;
}

```

## Hashset solution

### Complexity Hashset

- Time: O(n) Faster that hash map
- Space: O(n)

```Java

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for(int i: nums){
        if(set.contains(i)) return true;
        set.add(i);
    }
    return false;
}

```
