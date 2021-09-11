package com.paulniu.leetcode;

import java.util.Arrays;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class MergeTwoOrderList {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 7};
        merge(nums1, 4, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 两个数组合并，在执行排序操作
        for (int x = 0; x < n; x++) {
            nums1[m + x] = nums2[x];
        }
        Arrays.sort(nums1);
    }

}
