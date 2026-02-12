package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean isContainDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    static void main(String[] args) {
        int[] nums={1,2,3,4};
        boolean containDuplicate = isContainDuplicate(nums);
        System.out.println(containDuplicate);
    }
}
