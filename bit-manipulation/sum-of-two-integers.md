# Sum of Two Integers

## Problems

Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

### Example 1

    Input: a = 1, b = 2
    Output: 3

### Example 2

    Input: a = -2, b = 3
    Output: 1

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(1)

```java
public int getSum(int a, int b) {
    if (b == 0) {
        return a;
    }
    int sum = a ^ b;
    int carry = (a & b) << 1;
    return getSum(sum, carry);
}
```
