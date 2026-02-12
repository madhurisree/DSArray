package com.leetcode.problems;

import java.util.Vector;

//o(n2)
public class TwoSumForLoop {
    public static int[] twoSum(int target, Vector<Integer> nums){
        for (int i =0;i<nums.size();i++){
            for (int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) == target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }
    static void main(String[] args) {
        int target=9;
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(7);
        vector.add(11);
        vector.add(15);
        int[] result = twoSum(target,vector);

        System.out.println(result[0] + "," +result[1]);

    }
}
