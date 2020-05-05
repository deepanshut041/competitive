# Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

    Example 1:

    Input: [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
                 Not 7-1 = 6, as selling price needs to be larger than buying price.
 <br>

    Example 2:

    Input: [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transaction is done, i.e. max profit = 0.

## Brute Force

### Complexity BF

- Time: O(n2)
- Space: O(1)

```java
public int maxProfit(int[] prices) {
    int mp = 0;
    for(int i = 0; i < prices.length - 1; i++){
        for(int j = i + 1; j < prices.length;j++){
            int p = prices[j] - prices[i];
            if(p > mp){
                mp = p;
            }
        }
    }
    return mp;
}
```

## Optimized

### Complexity Optm

- Time: O(n)
- Space: O(1)

```java

public int maxProfit(int[] prices) {
    int mp = 0;
    if(prices.length < 2) return mp;
    int s = prices[0];
    for(int i = 1; i < prices.length; i++){
        int p = prices[i] - s;
        if(p < 0) s = prices[i];
        if(mp < p) mp = p;
    }
    return mp;
}
```
