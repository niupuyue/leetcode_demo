package com.paulniu.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 判断是否存在重复元素
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println("result = " + containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        return set.size() != nums.length;
    }

}
