package com.geekdigging.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * @Date: 2020/7/28
 * @Time: 23:43
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Solution {

    // 直接用算法解
    public boolean isPalindrome(int x) {
        // 先做极限情况判断
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revertedNumber = 0;

        // 一直循环到 revertedNumber 大于或者等于 x
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return revertedNumber == x || x == revertedNumber / 10;
    }

    // 转字符串的解法
    public boolean isPalindrome_1(int x) {
        // 先做极限情况判断
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(1024);
    }
}
