package com.github.barskiy.leetcode.explore.hashtable.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (valueToIndex.containsKey(remain)) {
                return new int[]{valueToIndex.get(remain), i};
            } else
                valueToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
