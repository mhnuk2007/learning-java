package Basics;

import java.util.HashMap;
/*
Input: n = 12
Output: 505379714
Explanation: The concatenation results in "1101110010111011110001001101010111100".
The decimal value of that is 118505380540.
After modulo 109 + 7, the result is 505379714.
 */
class Solution {
    private static final int MOD = 1_000_000_007;

    public static int concatenatedBinary(int n) {
        long result = 0;
        int bitLength = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                bitLength++;
            }
            System.out.println(bitLength);
            System.out.println(result);
            result = ((result << bitLength) | i) % MOD;
            System.out.println(result);
        }

        return (int) result;
    }
    public static void main(String[] args) {

        System.out.println(concatenatedBinary(2));




    }
}