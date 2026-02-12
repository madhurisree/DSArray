package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsduplicateForeach {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(Integer num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);

        }
       return false;
    }
    static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);

    }
}
