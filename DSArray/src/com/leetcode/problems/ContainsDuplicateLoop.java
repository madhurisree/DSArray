package com.leetcode.problems;

public class ContainsDuplicateLoop {
    static void main(String[] args) {
        boolean isFalg = false;
        int[] nums={1,2,3,3};
        for (int i =0;i<nums.length;i++){
            for (int j =i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    isFalg =true;
                }
            }
        }
        System.out.println(isFalg);
    }
}
