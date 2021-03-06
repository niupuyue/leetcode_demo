package com.paulniu.leetcode;

/**
 * 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * <p>
 * 示例1：
 * 输入：x = 121
 * 输出：true
 * <p>
 * 示例2：
 * 输入：x = -121
 * 输出：false
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("result = " + isPalindrome(1234321));
    }

    public static boolean isPalindrome(int x) {
        String s1 = new StringBuffer(x + "").reverse().toString();
        return s1.equals(String.valueOf(x));
    }

}
