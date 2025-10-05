/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start

import java.math.BigInteger;

class Solution {
    public int myAtoi(String s) {

    s = s.trim();
    if (s.isEmpty()) return 0;

    int sign = 1, index = 0;
    if (s.charAt(0) == '+' || s.charAt(0) == '-') {
        sign = (s.charAt(0) == '-') ? -1 : 1;
        index++;
    }

    long num = 0; // long to detect overflow
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
        num = num * 10 + (s.charAt(index) - '0');

        if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        index++;
    }

    return (int)(sign * num);

    }
}
// @lc code=end

