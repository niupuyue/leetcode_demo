package com.paulniu.leetcode;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * <p>
 * 示例2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] ss = new String[]{"flower", "flower", "flower", "flower"};
        System.out.println("result = " + longestCommonPrefix(ss));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        int offset = first.length();
        while (offset > 0) {
            String tmp = first.substring(0, offset);
            boolean isExist = true;
            for (int x = 0; x < strs.length; ++x) {
                if (!strs[x].startsWith(tmp)) {
                    isExist = false;
                }
            }
            if (isExist) {
                return tmp;
            }
            --offset;
        }
        return "";
    }

}
