package com.paulniu.leetcode;

public class containsNearbyDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println("result = " + containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int x = 0; x < nums.length; ++x) {
            for (int y = 1; (y + x) < nums.length && y <= k; ++y) {
                if (nums[x] == nums[x + y]) {
                    return true;
                }
            }
        }
        return false;
    }

}
