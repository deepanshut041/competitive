# 3Sum

## Problem

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

### Note

The solution set must not contain duplicate triplets.

### Example

    Given array nums = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
        [-1, 0, 1],
        [-1, -1, 2]
    ]

## Hash Solution(TLE)

TLE is for [0,0,0 ......] array

### Complexity Hashmap

- Time: O(n3)
- Space: O(n)

```Java
public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> ans = new HashSet<>();
    Map<Integer, List<Integer>> d = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        List<Integer> t = d.getOrDefault(nums[i], new ArrayList<>());
        t.add(i);
        d.put(nums[i], t);
    }
    for(int i = 0; i < nums.length - 1; i++){
        for (int j= i+1; j <nums.length; j++){
            for(int n: d.getOrDefault((nums[i] + nums[j]) * -1,  new ArrayList<>())){
                if(n != i && n != j){
                    List<Integer> v = Arrays.asList(nums[n], nums[i], nums[j]);
                    Collections.sort(v); 
                    ans.add(v);
                }
            }
        }
    }
    return new ArrayList<List<Integer>>(ans);
}
```

## Optimal Solution

### Complexity Optimal Solution

- Time: O(n2)
- Space: O(1)

```Java
public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if(i>0 && nums[i]==nums[i-1]) continue;
        int l=i+1, r=nums.length-1;
        while(l < r){
            int t = nums[i]+nums[l]+nums[r];
            if(t < 0) {
                while(++l<r && nums[l]==nums[l-1]);
            }else if(t > 0){ 
                while(--r>l && nums[r]==nums[r+1]);
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                while(++l<r && nums[l]==nums[l-1]);
                while(--r>l && nums[r]==nums[r+1]);
            }
        }
    }

    return ans;
}
```
