package com.paulniu.leetcode;

import java.util.HashMap;

/**
 * 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案
 * <p>
 * 示例1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class SumsOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = twoSum(nums, 16);
        System.out.println("结果是" + result[0] + ";" + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = (x + 1); y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(target - nums[x])) {
                return new int[]{map.get(target - nums[x]), x};
            }
            map.put(nums[x], x);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
