package com.paulniu.leetcode;

/**
 * 分割平衡字符串
 * 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
 * 给你一个平衡字符串s，请你将它分割成尽可能多的平衡字符串。
 * 注意：分割得到的每个字符串都必须是平衡字符串。
 * 返回可以通过分割得到的平衡字符串的 最大数量 。
 * <p>
 * 示例1：
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL"、"RRLL"、"RL"、"RL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
 * <p>
 * 示例2：
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL"、"LLLRRR"、"LR" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
 * <p>
 * 示例3：
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 */
public class BalancedStringSplit {

    public static void main(String[] args) {
        System.out.println("nums = " + balancedStringSplit("RLRRLLRLRL"));
    }

    /**
     * 解题思路，如果s是一个平衡字符串，则我们找到一个平衡字符串之后，剩下的内容也是一个平衡字符串
     * 而且题意要求我们求出一个最大的平衡数，则需要从最小的平衡字符串开始
     * @param s
     * @return
     */
    public static int balancedStringSplit(String s) {
        int nums = 0;
        int offset = 0;
        for (int x = 0; x < s.length(); ++x) {
            char tmp = s.charAt(x);
            if (tmp == 'L') {
                ++offset;
            } else {
                --offset;
            }
            if (offset == 0) {
                ++nums;
            }
        }
        return nums;
    }

}
