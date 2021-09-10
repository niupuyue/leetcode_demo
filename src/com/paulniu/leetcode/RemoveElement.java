package com.paulniu.leetcode;

/**
 * 移除给定元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println("result = " + removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 0, slow = 0;
        while (fast < n) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

}
