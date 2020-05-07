# Reverse digit

## Problem

Reverse bits of a given 32 bits unsigned integer.

### Example 1

    Input: 00000010100101000001111010011100
    Output: 00111001011110000010100101000000
    Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
<br>

### Example 2

    Input: 11111111111111111111111111111101
    Output: 10111111111111111111111111111111
    Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.

## Optimal Solution

### Complexity

- Time: O(n)
- Space: O(1)

```java
public int reverseBits(int n) {
    int t = 0;
    for (int i = 0; i < 32; ++i, n >>>= 1) {
        t <<= 1;
        t |= n & 1;
    }
    return t;
}
```
