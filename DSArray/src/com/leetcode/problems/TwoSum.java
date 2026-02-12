package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Time complexity O(n) and space complexity o(n)
public class TwoSum {

    public static int[] twoSum(int target,ArrayList<Integer> nums){
        Map map = new HashMap();
        for (int  i=0;i<nums.size();i++){
            int current = nums.get(i);
            int needed = target - current;
            if(map.containsKey(needed)){
                return new int[]{(int) map.get(needed),i};
            }
            map.put(current,i);

        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int target =5;
        ArrayList<Integer>  nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(3);
        nums.add(3);
        int[] result=twoSum(target,nums);
        System.out.println(result[0]+","+result[1]);
    }
}

